import java.util.ArrayList;

public class Recursion {
	/**
     * Lab 9: Recursion Suite
     * 
     * This lab tests your ability to implement recursion for several functions.
     * 
     * @author Stephen
     * @version 2018-04-23
     * @author Feras salous
     * @version 2019-10-23
     */

    /**
       * Function to compute the value n! of some input value n.
       * n! may bel defined as n! = 1 * 2 * ... * 2, 1! = 1.
       * 
       * THIS FUNCTION IS GIVEN TO YOU AS AN EXAMPLE OF RECURSION.
       * YOU SHOULD NOT CHANGE IT!
       * 
       * @param value The int input value n.
       * @return The int output value n!.
       */
    public int factorial(int value)
    {
        /*
         * Here is the base case (ending condition): value == 1.
         * This lets our recursion know when to stop.
         */
        if (value == 1)
        {
            return 1;

        }
        /*
         * Here is the recursive statement. The function calls itself when the base case is not met.
         * Something is altered when the function makes a new call to itself. In this case, the value
         * is updated. Specifically, it is decremented by 1.
         * 
         * By doing this, we break up the equation n! into n! = n * (n-1)!.
         */
        return value = value * factorial(value - 1);


        //TODO

    }

    /**
     * Computes the nth fibonacci number.
     * 
     * The fibonacci sequence may be defined as:
     * (1) The 1st fibonacci number is 1.
     * (2) The 2nd fibonacci number is also 1.
     * (3) The nth fibonacci number is equal to the (n-1)st fibonacci number plus
     *     the (n-2)nd fibonacci number.
     * 
     * The first few values in this sequence are:
     * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
     * 
     * @param n The rank of the fibonacci number to compute. I.e. n==1 denotes that we should
     * compute the 1st fibonacci number.
     * @return The value of the nth fibonacci number.
     */
    public int fibonacci(int n)
    {
    	if(n <= 0){
    		return 0;
    	}
    	else if(n == 1){
        	return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1); 
    }
    
    /**
     * In a binary tree, each node has two children. In a ternary tree, each node has 3 children.
     * Thus, in an n-nary tree, each node has n children. This function does not use the tree class
     * specified above. Rather this computes in general what the size of an n-nary tree is, for a given
     * n and a given height. The size is simply the number of nodes in the tree. We assume that each
     * node has the maximum (n) number of child nodes.
     * 
     * For example, for an n (called the branching factor here) of 4 and a height of 3, the tree at the first
     * level has 1 node. At the next level, it has 4 nodes, as the root has 4 children. The next level
     * has 16 nodes, because each of the 4 children of the root have 4 children. The size of the tree
     * is then 1 + 4 + 16 = 21.
     * 
     * Keep in mind that this should be a recursive function and that each subtree of a tree is also a tree.
     * I.e. you can call this function on any part of a larger tree to get the size of that sub-part.
     * In the previous example, if you called this function on any of the children of the root, the size
     * returned would be 1 + 4 = 5, as each of the root's children have 4 children of their own.
     * 
     * @param branchingFactor The number of children that each node has.
     * @param height The height of the subtree. When the height == 1, the subtree has no more children.
     * @return The size of the subtree - the number of nodes.
     */
    public int nnaryTreeSize(int branchingFactor, int height)
    {
        if (height == 1)
        {
            return 1;

	  
        }
        
        //TODO:
        else
        {
        	
        }
      
    }

    /**
     * This function uses the Tree data structure defined above. This simply sums up the all
     * the values of the tree. Given an input tree, you need to compute the sum of its value,
     * its children's values, its children's children's values, and so on.
     * 
     * @param tree The subtree to sum over.
     * @return The sum of the values in the subtree.
     */
    public int treeSum(Tree tree)
    {
        //TODO
    	
    }

    /**
     * This function computes the area of a series of squares and circles. Specifically, we consider a series
     * of squares and circles in which each successive shape is inscribed in the other. This function sums
     * the area of each shape and returns it. At each level of recursion, the funciton switches between a
     * circle being inscribed by a square, and a square being inscribed by a circle.
     * 
     * A circle inscribed in a square has the diameter equal to the width of a square. A square inscribed in a 
     * circle has a diagonal length equal to the diameter of the circle.
     * 
     * Given a square of width x, the circle inscribed will have a radius of size x/2. Thus, it will have an area
     * of pi * (x/2)^2
     * 
     * Given a circle of radius x, the inscribed square will have a diagonal length of size 2x. Thus, it will
     * have a width of 2x / sqrt(2) = sqrt(2) * x. It will thus have an area of 2 * (x^2)
     * 
     * The function recursively computes these areas until depth == 1. Then the area of the last shape is
     * returned.
     * 
     * @param square If the shape to compute the area for is a square or a circle.
     * @param length If a square, the width/height of the square. If a circle, the radius of the circle.
     * @param depth The recursion depth. When depth == 1 the area of the final shape is computed and returned;
     * recursion is stopped.
     * @return The sum value of sequentially inscribed squares and circles.
     */
    public double circledSquared(boolean square, double length, int depth)
    {
    	//TODO:
        /*
         * Compute the area of the current shape. Remember that:
         *  If the shape is a square, length refers to the square's width.
         *  If the shape is a circle, length refers to the circle's raidus.
         */
        double area = 0;
        
        
        
        /*
         * Simply return the area on the base case:
         */
        if (depth == 1)
        {
            return area;
        }

        /*
         * If the current shape is a square, the next is an inscribed circle.
         * 
         * We have a square of width <length>. Thus, the radius of the inscribed
         * circle will be <length> / 2.
         */
        
        
        
        
        //TODO: Complete the requirements from the block of comments above.
        
        
        
        
        /*
         * If the current shape is a circle, the next in an inscribed square.
         * 
         * We have a circle of radius <length>. Thus, the half-diagonal of the 
         * inscribed square will be <length>. We know that for the variables
         * x = width/2 and y = diagonalLength/2 = <length>/2 of the inscribed square
         * (where "width" is the width of the inscribed square),
         * we can find width = 2*x by applying the pythagorean theorem:
         *  => x^2 + x^2 = y^2
         *  => 2*(x^2) = y^2 
         *  => x^2 = (y^2) / 2
         *  => x = y / sqrt(2)
         *  => width = 2 * x = 2 * y / sqrt(2) = sqrt(2) * y
         *  => width = sqrt(2) * <length>
         */
        
        
        
        //TODO: Complete the requirements from the block of comments above.
        
        
        
    }

}
