//Number Guessing Game in Java Swing


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Guess extends JFrame
{
    
    //declaring the "text fields"----> 
    JTextField tx1, tx2, tx3, tx4;

    //declaring the "label"----> 
    JLabel j4;

    //declaring the "button listeners"--->
    ButtonListener bl1;
    ButtonListener2 bl2;
    ButtonListener3 bl3;    

   //calculating the random number in "random" variable-->
    int random=(int) (Math.random()*100);   


    //initializing "counter varaiable(count) to 0--->	
    int count=0;


     //constructor for implementing the frame and container---->
     public Guess()
    {
          
	
        //Get the container
       	
 	Container c = getContentPane();


        //Set absolute layout to NULL-->        
        c.setLayout(null);   

        //Set Background Color--->
        c.setBackground(Color.gray); 

        
    //*Creating label for " Guess my number" text field------>


        JLabel j=new JLabel("Guess the number?");
        j.setForeground(Color.green);
        j.setFont(new Font("Times New Roman",Font.BOLD,24));
        j.setSize(270,20);
        j.setLocation(50,50);

     //*Creating label for "Enter a number"---> 

        JLabel j1=new JLabel("Enter a number between 1-100");
	    j1.setForeground(Color.BLACK);
        j1.setFont(new Font("Times New Roman",Font.PLAIN,17));
        j1.setSize(270,20);
        j1.setLocation(50,80);


     //*Creating TextField for "input guess"---->

        tx1=new JTextField(10);
        tx1.setSize(50,30);
        tx1.setLocation(110,120);

     //*Creating Label for "Display message"--->
        
        j4=new JLabel("Try and guess my number");
	j4.setForeground(Color.BLACK);
        j4.setFont(new Font("Times New Roman",Font.PLAIN,17));
        j4.setSize(270,20);
        j4.setLocation(60,150);

		

     //*Creating Text field for "best score"---->

        tx2=new JTextField(10);
        tx2.setSize(40,20);
        tx2.setLocation(10,10);        

     //*Creating Label for best score---->

        JLabel j5=new JLabel("Best Score");
	j5.setForeground(Color.BLACK);
        j5.setFont(new Font("Times New Roman",Font.PLAIN,17));
        j5.setSize(270,20);
        j5.setLocation(60,10);

     //*Creating guess text field---->

        tx3=new JTextField(10);
        tx3.setSize(40,20);
        tx3.setLocation(210,10);

     //*Creating "guess " Label------>

        JLabel j6=new JLabel("Guesses");
	j6.setForeground(Color.BLACK);
        j6.setFont(new Font("Times New Roman",Font.PLAIN,17));
        j6.setSize(270,20);
        j6.setLocation(260,10);

     //*creating 3 buttons------------------------>

    //*1st button for "guess"--->
        JButton b1=new JButton("Guess");
        b1.setSize(150,40);
        b1.setLocation(80,250);
        bl1=new ButtonListener();        
        b1.addActionListener(bl1);


    //*2nd button for "give up"--->   
        JButton b2=new JButton("Give up!");
        b2.setSize(100,30);
        b2.setLocation(50,200);
        bl2=new ButtonListener2();
        b2.addActionListener(bl2);


    //*3rd button for "play again"--->    

        JButton b3=new JButton("Play Again");    
        b3.setSize(120,30);
        b3.setLocation(160,200);    
        bl3=new ButtonListener3();        
        b3.addActionListener(bl3);


    //*ADD THE COMPONENTS IN THE PANEL------------->
	
        c.add(j5);    
        c.add(j4);    
        c.add(j);    
        c.add(j1);
        c.add(tx1);
        c.add(tx2);
        c.add(tx3);
        c.add(b1);    
        c.add(b2);
        c.add(b3);        
        c.add(j6);
	
        

         

    //*Changing TextFields to UnEditable so that the text fields can become "READ-ONLY"text--->

        tx2.setEditable(false);
        tx3.setEditable(false);    

    //*Set the title of the "window"--->

        setTitle("GUESS THE NUMBER ?");        

   //*SET the size of the window and set visibility to "TRUE" so that it can be displayed------>

        setSize(550,350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


}



 //*applying action listener on the first button "Guess"----->

    private class ButtonListener implements ActionListener
    {
        int bestScore=100;
        public void actionPerformed(ActionEvent e)
        {
            int a = Integer.parseInt(tx1.getText());
            count=count+1;
            if(a<random)
            {
                j4.setText(a+" is too low, try again!!");
            }    
            else if(a>random)
            {
                j4.setText(a+" is too high, try again!!");
            }
            else
            {
                j4.setText("CORRECT, YOU WIN!!!!");    
                if(count<bestScore)
                {    
                    bestScore=count;
                    tx2.setText(bestScore+"");
                }
                else
                    tx2.setText(""+bestScore);
               	    tx1.setEditable(false);
            }

        //setting focus to input guess "text field" so that user dont have to manually focus it---->
            tx1.requestFocus();
            tx1.selectAll();

            tx3.setText(count+"");
        }
    }



//*applying action listener on the second button  "Give up"----->

    private class ButtonListener2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            tx3.setText("");
            j4.setText(random+" is the answer!");
            tx1.setText("");
            tx1.setEditable(false);
        }
    } 


//*applying action listener on the third button "play again"----->       

    private class ButtonListener3 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            random=(int) (Math.random()*100);
            tx1.setText("");
            tx3.setText("");
            j4.setText("Try and guess my number");
            tx3.setText("");
            count=0;
            tx1.setEditable(true);    
            tx1.requestFocus();
        }
    }

//*creating the main function and object of Guess class----> 

    public static void main(String[] args)
    {
        new Guess();
    }
}