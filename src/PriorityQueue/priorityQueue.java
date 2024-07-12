package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
class student implements Comparable<student>
{
    String name;
    int rank;

    public student(String name, int rank)
    {
        this.name = name;
        this.rank = rank;
    }
    @Override
    public int compareTo(student o)
    {
        return this.rank - o.rank;
    }
    @Override
    public String toString()
    {
        return this.name;
    }
}
public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new student("A",25));
        pq.add(new student("B",30));
        pq.add(new student("C",15));
        pq.add(new student("D",40));
        pq.add(new student("E",5));
        pq.add(new student("F",6));
        while (!pq.isEmpty())
        {
            System.out.println(STR."\{pq.peek().name} \{pq.peek().rank}");
            pq.remove();
        }
    }
}
