import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * The Class ChatBot.
 */
public class ChatBot extends JFrame {
 
    /** The typing area txt. */
    private final JTextField typingAreaTxt = new JTextField();

    /** The chat area. */
    private final JTextArea chatArea = new JTextArea();

    /**
     * Instantiates a bot.
     */
    public ChatBot() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(600, 600);        //SIZE of the frame
        this.setVisible(true);
        this.setResizable(false);         // resize wala option disabled
        this.setLayout(null);
        this.setTitle("ChatBot");
		this.getContentPane().setBackground(Color.BLACK);       //background color black
        
		typingAreaTxt.setLocation(2, 540);              //user input output ke lia
        typingAreaTxt.setSize(590, 30);

        typingAreaTxt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
                final String userText = typingAreaTxt.getText();
                chatArea.append("You: " + userText + "\n");
                if (userText.toLowerCase().contains("hey") || userText.toLowerCase().contains("hello") || userText.toLowerCase().contains("hi")) {
                    int decider = (int) (Math.random() * 3 + 1);
                    if (decider == 1) {
                        botResponse("Hello there!");
                    } else if (decider == 2) {
                        botResponse("Wassup");
                    }
                else if (decider == 3) {
                        botResponse("hey");
                    }  
                    }			
                else if (userText.toLowerCase().contains("how are you")) {
                    int decider = (int) (Math.random() * 2 + 1);
                    if (decider == 1) {
                        botResponse("I'm doing well, thanks");
                    } else if (decider == 2) {
                        botResponse("Not too bad");
                    }
                }
            else if (userText.toLowerCase().contains("what is your name")) {
                  botResponse("My Name is Bono ");
              }
			else if (userText.toLowerCase().contains("why is your name bono")) {
				botResponse("idk ;-)");
			}
			else if (userText.toLowerCase().contains("what does bono means")) {
				botResponse("Bono is a name of a singer, you can google it.");
			}
			else if (userText.toLowerCase().contains("who are you")) {
				botResponse("I am Bono the ChatBot.");
			  }
            else if (userText.toLowerCase().contains("bye")) {
                  int decider = (int) (Math.random() * 2 + 1);
                    if (decider == 1) {
                        botResponse("Bye");
                    } else if (decider == 2) {
                        botResponse("See you!");
                    }
                }             
                
				else if (userText.toLowerCase().contains("Namaste")) {
                    botResponse("Namaste");
                    } 
					
				else if (userText.toLowerCase().contains("kaisan baa")) {
					int decider1 = (int) (Math.random() * 2 + 1);
                    if (decider1 == 1) {
                        botResponse("thik baa");
                    } else if (decider1 == 2) {
                        botResponse("acha baa");
                    }
                }

                 else {
                    int decider = (int) (Math.random() * 5 + 1);
                    if (decider == 1) {
                        botResponse("I didn't get that");
                    } else if (decider == 2) {
                        botResponse("Please rephrase that");
                    } else if (decider == 3) {
                        botResponse("I am not sure.");
                    } else if (decider == 4) {
                        botResponse("Google it");
                    }else if (decider == 5) {
                        botResponse("Google Karle Bhai");
                    }
                }
                typingAreaTxt.setText("");
            }
       
        });

        chatArea.setLocation(20, 20);
        chatArea.setSize(560, 510);
        chatArea.setEditable(false);
		Color color = new Color ( 161, 186, 227);   //chat area ka color
		chatArea.setBackground(color);  
		chatArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));    // font ke lia
        this.add(typingAreaTxt);
        this.add(chatArea);
    } 
    public void botResponse(final String answer) {
        chatArea.append("Bono: " + answer + "\n");
    }
    public static void main(final String[] args) {
        new ChatBot();
    }
}