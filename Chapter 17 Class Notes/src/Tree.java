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
}
