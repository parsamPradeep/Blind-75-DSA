package com.blind.graph;

import java.util.ArrayList;

public class CourseSchedule {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		ArrayList<Integer> graph[] = new ArrayList[numCourses];
		boolean visited[] = new boolean[numCourses];
		boolean memo[] = new boolean[numCourses];

		for (int i = 0; i < numCourses; i++)
			graph[i] = new ArrayList<Integer>();

		for (int i = 0; i < prerequisites.length; i++)
			graph[prerequisites[i][1]].add(prerequisites[i][0]);

		for (int i = 0; i < numCourses; i++)
			if (!dfs(visited, graph, i, memo))
				return false;

		return true;

	}

	public boolean dfs(boolean visited[], ArrayList<Integer> graph[], int course, boolean memo[]) {
		if (visited[course] == true)
			return false;

		if (memo[course])
			return true;

		visited[course] = true;

		for (int i = 0; i < graph[course].size(); i++)
			if (!dfs(visited, graph, (int) graph[course].get(i), memo))
				return false;

		visited[course] = false;
		memo[course] = true;
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
