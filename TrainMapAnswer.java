package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;

public class TrainMapAnswer {

	private static class Station {
		private String name;
		private List<Station> neighbours;

		public Station(String name) {
			this.name = name;
			this.neighbours = new ArrayList<>(3);
		}

		String getName() {
			return name;
		}

		void addNeighbour(Station v) {
			this.neighbours.add(v);
		}

		List<Station> getNeighbours() {
			return this.neighbours;
		}

		@Override
		public boolean equals(Object obj) {
			return obj instanceof Station && this.name.equals(((Station) obj).getName());
		}

		@Override
		public int hashCode() {
			return Objects.hash(this.name);
		}
	}

	/**
	 * class TrainMap
	 * <p>
	 * Respresents whole rail network - consists of number of the Station objects.
	 * Stations in the map are bi-directionally connected. Distance between any 2
	 * stations is of same constant distance unit. This implies that shortest
	 * distance between any 2 stations depends only on number of stations in between
	 */
	private static class TrainMap {

		private HashMap<String, Station> stations;

		public TrainMap() {
			this.stations = new HashMap<>();
		}

		public TrainMap addStation(String name) {
			Station s = new Station(name);
			this.stations.putIfAbsent(name, s);
			return this;
		}

		public Station getStation(String name) {
			return this.stations.get(name);
		}

		public TrainMap connectStations(Station fromStation, Station toStation) {
			if (fromStation == null) {
				throw new IllegalArgumentException("From station is null");
			}
			if (toStation == null) {
				throw new IllegalArgumentException("From station is null");
			}
			fromStation.addNeighbour(toStation);
			toStation.addNeighbour(fromStation);
			return this;
		}

		public List<Station> shortestPath(String from, String to) {
			if (!stations.containsKey(from) || !stations.containsKey(to)) {
				System.out.println("Invalid Input");
				return null;
			}

			Station fromStation = stations.get(from);

			Queue<Station> queue = new LinkedList<>();
			queue.add(fromStation);

			Map<Station, Station> hMap = new HashMap<>();
			hMap.put(fromStation, null);

			while (!queue.isEmpty()) {

				Station currentStation = queue.poll();

				if (currentStation.getName().equals(to)) {
					break;
				}

				for (Station xyz : currentStation.getNeighbours()) {
					if (!hMap.containsKey(xyz)) {
						hMap.put(xyz, currentStation);
						queue.add(xyz);
					}
				}
			}

			List<Station> outputList = new ArrayList<>();

			Station destinationStation = stations.get(to);

			while (destinationStation != null) {
				outputList.add(destinationStation);
				destinationStation = hMap.get(destinationStation);
			}

			Collections.reverse(outputList);

			return outputList;
		}

		public static String convertPathToStringRepresentation(List<Station> path) {
			if (path.isEmpty()) {
				return "";
			}
			return path.stream().map(Station::getName).reduce((s1, s2) -> s1 + "->" + s2).get();
		}
	}

	public static boolean doTestsPass() {
		// todo: implement more tests, please
		// feel free to make testing more elegant
		TrainMap trainMap = new TrainMap();

		trainMap.addStation("King's Cross St Pancras").addStation("Angel").addStation("Old Street")
				.addStation("Moorgate").addStation("Farringdon").addStation("Barbican").addStation("Russel Square")
				.addStation("Holborn").addStation("Chancery Lane").addStation("St Paul's").addStation("Bank");

		trainMap.connectStations(trainMap.getStation("King's Cross St Pancras"), trainMap.getStation("Angel"))
				.connectStations(trainMap.getStation("King's Cross St Pancras"), trainMap.getStation("Farringdon"))
				.connectStations(trainMap.getStation("King's Cross St Pancras"), trainMap.getStation("Russel Square"))
				.connectStations(trainMap.getStation("Russel Square"), trainMap.getStation("Holborn"))
				.connectStations(trainMap.getStation("Holborn"), trainMap.getStation("Chancery Lane"))
				.connectStations(trainMap.getStation("Chancery Lane"), trainMap.getStation("St Paul's"))
				.connectStations(trainMap.getStation("St Paul's"), trainMap.getStation("Bank"))
				.connectStations(trainMap.getStation("Angel"), trainMap.getStation("Old Street"))
				.connectStations(trainMap.getStation("Old Street"), trainMap.getStation("Moorgate"))
				.connectStations(trainMap.getStation("Moorgate"), trainMap.getStation("Bank"))
				.connectStations(trainMap.getStation("Farringdon"), trainMap.getStation("Barbican"))
				.connectStations(trainMap.getStation("Barbican"), trainMap.getStation("Moorgate"));

		String solution = "King's Cross St Pancras->Russel Square->Holborn->Chancery Lane->St Paul's";

		return solution.equals(TrainMap
				.convertPathToStringRepresentation(trainMap.shortestPath("King's Cross St Pancras", "St Paul's")));
	}

	public static void main(String[] args) {
		if (doTestsPass()) {
			System.out.println("All tests pass");
		} else {
			System.out.println("Tests fail.");
		}
	}

}
