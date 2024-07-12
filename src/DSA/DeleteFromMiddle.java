package DSA;

import java.util.Stack;

public class DeleteFromMiddle {
    public static void deleteFromMid(Stack<Integer> st ,int size)
    {
        if (st.isEmpty() )
            return;

        if(st.size() == (size+1)/2)
        {
            st.pop();
            return;
        }

        int top = st.pop();
        deleteFromMid(st,size);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        deleteFromMid(st,5);
        System.out.println(st);
    }
}
