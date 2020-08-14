            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode cur = q.remove();
                sum += cur.val;
                count++;
                if(cur.left != null){
                    q.add(cur.left);
                }
                if(cur.right != null){
                    q.add(cur.right);
                }
            }
            res.add(sum * 1.0 / size);
​
        }
        return res;
    }
    
//     public List<Double> averageOfLevels(TreeNode root) {
//         //Sum stores the sum of each level
//         //Count stores the number of nodes at each level
//         List<Double> sum=new ArrayList<>();
//         List<Double> count=new ArrayList<>();
//         compute(sum,count,root,0);
//         for(int i=0;i<sum.size();i++)
//             sum.set(i,sum.get(i)/count.get(i));
//         return sum;
        
//     }
    
    public void compute(List<Double> sum,List<Double> count,TreeNode curr,int level)
    {
        if(curr==null) return;
        
        if(sum.size()==level) 
        {
            sum.add(0.0);
            count.add(0.0);
        }   
        
        sum.set(level,sum.get(level)+(double)curr.val);
        count.set(level,count.get(level)+1);
        
        compute(sum,count,curr.left,level+1);
        compute(sum,count,curr.right,level+1);
    }
}
​
