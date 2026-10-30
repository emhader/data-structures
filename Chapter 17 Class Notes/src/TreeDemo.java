/**
   This class demonstrates the tree class.
*/
public class TreeDemo
{
   public static void main(String[] args)
   {
      Tree t1 = new Tree("Anne");
      Tree t2 = new Tree("Peter");
      t1.addSubtree(t2);
      Tree t3 = new Tree("Zara");
      t1.addSubtree(t3);
      Tree t4 = new Tree("Savannah");
      t2.addSubtree(t4);
      System.out.println("Size: " + t1.size());

      //bianatry tree test
      BinaryTree empty = new BinaryTree();
      BinaryTree bt4 = new BinaryTree("Chicago");
 BinaryTree bt3 = new BinaryTree("Atlanta");
  BinaryTree bt2 = new BinaryTree("Miami", bt4, empty);
  BinaryTree bt1 = new BinaryTree("Miami", bt2, bt3);

  System.out.println("Binary tree root" + bt1.data());
  System.out.println("Binary tree height" + bt1.height());


      for(int i = 0; i < bt1.height(); i++)
      {
         if(bt1.data() != null)
         {
            System.out.println(bt1.data());
         }
         else  System.out.println(i);
      }
  
   }
}
