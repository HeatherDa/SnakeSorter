package com.Heather;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan=new Scanner(System.in);
        LinkedList<Snake> snakes=new LinkedList<>();

        for(int i=0;i<5;i++){//create list of snakes
            System.out.println("Type the name and venomrating of a Snake separated by a comma.");
            String[] s=(scan.nextLine()).split(",");
            List<String> sn = Arrays.asList(s);
            Snake snake = new Snake(sn.get(0), Double.parseDouble(sn.get(1)));
            snakes.add(snake);
        }
        Collections.sort(snakes);
        for (Snake k:snakes){
            k.writeSnake();
        }

    }
}
