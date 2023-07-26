//importing libraries to create the frame and implemnting the action listeners--->

import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;

//creating a class count that will hold all the components such as frame ,fields etc..--->
  
public class count extends JFrame
{  
                //declaring a "Jframe"---->
			JFrame frame;
		

		//declaring "JLabels"--->
			JLabel lb1,lb2;
			
   		
	       //declaring "JTextArea "---->
                      JTextArea ta;  
    		

		//declaring a "jbutton"--->
			JButton b; 


		////declaring a "button listener"--->
                ButtonListener bl1; 


		
    		//constructor---> 
   	        count()
		{  
        			 setTitle("WORD COUNTER.."); 

			//*creating label as"lb1" to display the number of characters-----> 
      		 	 	lb1=new JLabel("Characters :"); 
				lb1.setFont(new Font("Times New Roman", Font. PLAIN, 17)); 
				lb1.setForeground(Color.blue);	
        		 	lb1.setBounds(50,50,100,30); 

			//*creating label as"lb2" to display the numbers of words-----> 
 
      			 	lb2=new JLabel(" Words : ");
				lb2.setFont(new Font("Times New Roman", Font. PLAIN, 17));
				lb2.setForeground(Color.blue);	  
       			 	lb2.setBounds(50,80,100,20);

  
          	       //*creating the text area where the user will provide the input---->
        			ta=new JTextArea();  
        			ta.setBounds(50,110,300,200); 

 		      //*creating a button named "check" that implements an action listener that when clicking ,display the number of words and characters--> 
          
        			b=new JButton("check");  
        			b.setBounds(50,320, 80,30);//x axis,y axis,width,height.

		       //*applying the action listener on the button---->


        	       		bl1=new ButtonListener();   
                       		b.addActionListener(bl1);
     

		     //*adding components in the frame---->   
	
        			add(lb1);
				add(lb2);
				add(ta);
				add(b);
			
		  //*setting the size of the frame----->

      				setSize(400,400);  
        			setLayout(null);
       				setVisible(true); //set visibility to true. 
        			setDefaultCloseOperation(EXIT_ON_CLOSE);  
              } 


   //implementing the above declared action listener  in the button--->		
	private class ButtonListener implements ActionListener
	{
             public void actionPerformed(ActionEvent e)
	    {  
        	if(e.getSource()==b)
		{  
       			 String text=ta.getText();  
        	 	 lb1.setText("Characters:"+text.length());  
       		 	 String words[]=text.split("\\s");  
        	 	 lb2.setText("Words: "+words.length);  
       		 }
	
 	    } 
}

 
	public static void main(String[] args) 
       {  
    	    new count();  
        }
}  