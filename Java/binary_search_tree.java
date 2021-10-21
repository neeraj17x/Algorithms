/***
 * Binary Search Tree
 * 
*/
import java.util.Scanner;
class Node
{
    Node left, right;
    int data;

    //Constructor
    public Node(int data)
    {
        this.data = data;
    }

    //Create new node in the Tree and insert the value
    public void insert(int value)
    {
        if(value <= data) {
            if(left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if(right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value)
    {
        if(value == data) {
            return true;
        } else if(value <= data) {
            if(left == null) {
                return false;
            } else {
                return left.contains(value);//Recurisve call
            }
        } else {
            if(right == null) {
                return false;
            } else {
                return right.contains(value);//Recurisve call
            }
        }
    }

    public void printInOrder()
    {
        if(left != null) {
            left.printInOrder();//Recurisve call
        }
        System.out.println(data);
        if(right != null) {
            right.printInOrder();
        }
    }

}