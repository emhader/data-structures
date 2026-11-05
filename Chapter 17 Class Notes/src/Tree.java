import java.util.List;
import java.util.ArrayList;

/**
    A tree in which each node has an arbitrary number of children.
*/
public class Tree
{
    private Node root;
    static class Node
    {

        Object data;
        public List<Node> children;

        /**
            Computes the size of the subtree whose root is this node.
            @return the number of nodes in the subtree
        */
        public int size()
        {
            int total = 1; 
            for(Node child : this.children)
            {
                total += child.size();
            }
            return total;
        }
    }

    /**
        Constructs a tree with one node and no children.
        @param rootData the data for the root
    */
    public Tree(Object rootData)
    {
        //creating it is a node
        this.root = new Node();

        //setting the data of the root node to rootData
        this.root.data = rootData;

        //initializing the children of the root node to an empty list
        this.root.children = new ArrayList<>();
    }

    /**
        Adds a subtree as the last child of the root.
    */
    public void addSubtree(Tree subtree)
    {
        //adding the root will add all of the children of the subtree to the root of this tree
        this.root.children.add(subtree.root);
    }

    /**
        Computes the size of this tree.
        @return the number of nodes in the tree
    */
    public int size() 
    {
        //wrote the method in the node class
        return this.root.size();
    }

    // Additional methods will be added in later sections.

    //A Visitor method is called for every visited node during a tree traversal
    public interface Visitor
    {
        /*
            The Visit method is called for each visited node
            @Param data: the data of the nde being visited
         */
        void visit(Object data);

    }
     /*
        traverse this tree in preorder.
        @param v: the visitor to be invoked on each node
         */
        public void preorder(Visitor v)
        {
            Tree.preorder(this.root, v);
        }
        
     /*
        Traverse the tree with a given root in preorder
        @param n: the root of the tree to traverse
        @param v: the visitor to be invoked on each node
         */
    private static void preorder(Node n , Visitor v)
        {
            if(n == null)
                return;

            v.visit(n.data);

            for(Node child : n.children)
                Tree.preorder(child, v);
        }
}
