package com.blind.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {
	public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int res[]=new int[k];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else
                map.put(nums[i],1);
               
        }
       Queue<Integer> heap=new PriorityQueue<Integer>((n1,n2) -> map.get(n1)-map.get(n2));
        for(int key:map.keySet()){
            heap.add(key);
            if(heap.size()>k)
                heap.poll();
        }
    for(int i=k-1;i>=0;--i)
        res[i]=heap.poll();
               
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,3,3,4,5,6};
		arr=topKFrequent(arr, 2);
	}

}
