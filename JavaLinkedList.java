//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Carolyn Savas

import java.util.LinkedList;
import java.util.ListIterator;
import static java.lang.System.*;

public class JavaLinkedList
{
 private LinkedList<Integer> list;

 public JavaLinkedList()
 {
  list = new LinkedList<Integer>();
 }

 public JavaLinkedList(int[] nums)
 {
  list = new LinkedList<Integer>();
  for(int num : nums)
  {
   list.add(num);
  }
 }

 public double getSum(  )
 {
  double total=0;
  ListIterator<Integer> x = list.listIterator(0);
  while(x.hasNext()){
    total +=(int)x.next();
  }
  return total;
 }

 public double getAvg(  )
 {
  return ((double)this.getSum()/(double)list.size());
 }

 public int getLargest()
 {
  ListIterator<Integer> x = list.listIterator(0);
  int largest= x.next();
  while(x.hasNext()){
    int temp = x.next();
    if(largest < temp)
      largest=temp;
  }
  return largest;
 }

 public int getSmallest()
 {
  ListIterator<Integer> x = list.listIterator(0);
  int smallest= x.next();
  while(x.hasNext()){
    int temp = x.next();
    if(smallest > temp)
      smallest=temp;
  }
  return smallest;
 }

 public String toString()
 {
  String output="SUM:: " + this.getSum() + "\n AVERAGE:: " + this.getAvg() + "\n SMALLEST:: " + this.getSmallest() + "\n LARGEST:: " + this.getLargest() + "\n";
  return output;
 }
}