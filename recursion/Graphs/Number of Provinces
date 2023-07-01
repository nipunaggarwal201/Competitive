class Solution {

    //dfs using recursion
    private static void dfs(int node, ArrayList<ArrayList<Integer>> arr, int[] vis)
    {
        vis[node] =1;
        for(Integer it : arr.get(node))
        {
            if(vis[it]==0) dfs(it, arr,vis);
        }
    }

    //bfs using queue
    private static void bfs(int node, ArrayList<ArrayList<Integer>> arr, int[] vis)
    {
        Queue<Integer> q = new LinkedList<>();
        vis[node] =1;
        q.add(node);
        while(!q.isEmpty())
        {
            Integer it = q.poll();
            for(int i: arr.get(it))
            {
                if(vis[i]==0)
                {
                    q.add(i);
                    vis[i] =1;
                } 
            }
        }
    }

//if input is Adjacency Matrix

    public int findCircleNum(int[][] isConnected) {
        
        //Using Adjacency List
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        int n = isConnected.length;
        int[] vis = new int[n];
        for(int j=0;j<n;j++)
        {
            arr.add(new ArrayList<Integer>());
        }
        for(int i=0;i< n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j] == 1 && i!=j)
                {
                    arr.get(i).add(j);
                    arr.get(j).add(i);
                }
                
            }
        }
        //Calling DFS or BFS
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            if(vis[i] ==0)
            {
                ans +=1;
                dfs(i,arr,vis);
                //bfs(i,arr,vis);
            }
        }
        return ans;
    }
}
