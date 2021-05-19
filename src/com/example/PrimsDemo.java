package com.example;

import java.util.Stack;

public class PrimsDemo {

	static int[][] graph = { { Integer.MAX_VALUE, 5, Integer.MAX_VALUE, Integer.MAX_VALUE },
			{ 5, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE },
			{ Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 5 },
			{ Integer.MAX_VALUE, Integer.MAX_VALUE, 5, Integer.MAX_VALUE } };

	public static void main(String[] args) {
		findMST(graph);
	}

	private static void findMST(int[][] graph) {
		int vertices = graph.length;
		Stack<Integer> mst = new Stack<Integer>();
		mst.push(0);
		int minWeight = 0;
		while (mst.size() < vertices) {
			int adjMinVertex = -1;
			int adjMinWeight = Integer.MAX_VALUE;
			for (int vertex : mst) {
				for (int j = 0; j < vertices; j++) {
					int adjWeight = graph[vertex][j];
					if (adjWeight > 0 && adjWeight < Integer.MAX_VALUE && !mst.contains(j)) {
						if (adjWeight < adjMinWeight) {
							adjMinWeight = adjWeight;
							adjMinVertex = j;
						}
					}
				}
			}
			if (adjMinVertex != -1) {
				minWeight = minWeight + adjMinWeight;
				mst.push(adjMinVertex);
			} else {
				System.out.println("TREE IS DISCONNECTED");
				break;
			}
		}
		System.out.println(minWeight + "--" + mst);
	}

	private static boolean isSpanned(int[] mst) {
		boolean result = true;
		for (int i : mst) {
			if (i == -1) {
				result = false;
				break;
			}
		}
		return result;
	}
}
