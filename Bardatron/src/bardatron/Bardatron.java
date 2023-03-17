package bardatron;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.*;
public class Bardatron
{
  public static void main(String [] args) throws AWTException, InterruptedException{
String toParse = "";
Scanner scanner = new Scanner(System.in);
System.out.println("Welcome to the Super Bard-O-Tron Script!");
System.out.println("");
System.out.println("Please enter your notation below, or type \"greensleeves\" for a hastily-made demo.");
System.out.println("Accepted notes are: A B Bb C C# D Eb E F F# G G#.");
System.out.println("To modify the note octave, use the ingame syntax. E.G.: C-1, C+1 or C+2. Tildes before notes add more and more sustain.");
System.out.println("Please separate each note with a space. Dashes indicate delays between notes.");
System.out.println("Add more dashes to increase the delay. Each dash equals 50 milliseconds.");
System.out.println("PLEASE NOTE: The input is currently case sensitive.");
toParse = scanner.nextLine();
if (toParse.equalsIgnoreCase("greensleeves")){
  System.out.println("You have selected greensleeves! Your song will begin playing after a 5-second delay.");
  System.out.println(" Please wait, and make sure the FFXIV window is in focus.");
  toParse = "E - G - - - - A - B - - - - C+1 - B - - A - - -  F# - - D - - - - E - - F# - - G - - E - - E - Eb - E - - F# - - - Eb - - - B - - - - - - - - - - - - - - E  - G - - A - C+1 - - - B - A - F# - - D - - - - E - - - G - - - - F# - - - - E - - - Eb - - - E - - - - E - - - - - - - - - - - - - - - - E - G - - - - A - B - - - - C+1 - B - - A - - -  F# - - D - - - - E - - F# - - G - - E - - E - Eb - E - - F# - - - Eb - - - B - - - - - - - - - - - - - - E  - G - - A - C+1 - - - B - A - F# - - D - - - - E - - - G - - - - F# - - - - E - - - Eb - - - E - - - - E";
}
if (!toParse.equalsIgnoreCase("greensleeves")){
  System.out.println("Your song will begin playing after a 5-second delay. Please wait, and make sure the FFXIV window is in focus.");
  System.out.println("You entered:"); 
}
System.out.println(toParse);
//CONVERSION PROCESS
String buffer1 = toParse;
int z = 35;
int x = 60;
String[] bufferarray = buffer1.split(" ");
Robot robot = new Robot();
//NOTES ARE C C# D Eb E F F# G G# A Bb B WITH +1/-1 OCTAVES
Thread.sleep(5000);
int delayCount = 0;

for (int i = 0; i < bufferarray.length; i++)
   {
if(bufferarray[i].equals("~")){
  delayCount++;
  
}
else if(bufferarray[i].equals("A")){
        robot.keyPress(KeyEvent.VK_Y);
        Thread.sleep(x*delayCount);
        delayCount=0;
        robot.keyRelease(KeyEvent.VK_Y);
        Thread.sleep(x);
      }else if (bufferarray[i].equals("B")){
        robot.keyPress(KeyEvent.VK_U);
        Thread.sleep(x*delayCount);
        delayCount=0;
        robot.keyRelease(KeyEvent.VK_U);
        Thread.sleep(x);
     }else if (bufferarray[i].equals("Bb")){
       robot.keyPress(KeyEvent.VK_7);
       Thread.sleep(x*delayCount);
       delayCount=0;
       robot.keyRelease(KeyEvent.VK_7);
       Thread.sleep(x);
    }else if (bufferarray[i].equals("C")){
      robot.keyPress(KeyEvent.VK_Q);
      Thread.sleep(x*delayCount);
      delayCount=0;
      robot.keyRelease(KeyEvent.VK_Q);
      Thread.sleep(x);
   }else if (bufferarray[i].equals("C#")){
     robot.keyPress(KeyEvent.VK_2);
     Thread.sleep(x*delayCount);
     delayCount=0;
     robot.keyRelease(KeyEvent.VK_2);
     Thread.sleep(x);
  }else if (bufferarray[i].equals("D")){
    robot.keyPress(KeyEvent.VK_W);
    Thread.sleep(x*delayCount);
    delayCount=0;
    robot.keyRelease(KeyEvent.VK_W);
    Thread.sleep(x);
 }else if (bufferarray[i].equals("Eb")){
   robot.keyPress(KeyEvent.VK_3);
   Thread.sleep(x*delayCount);
   delayCount=0;
   robot.keyRelease(KeyEvent.VK_3);
   Thread.sleep(x);
}else if (bufferarray[i].equals("E")){
  robot.keyPress(KeyEvent.VK_E);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_E);
  Thread.sleep(x);
}else if (bufferarray[i].equals("F")){
  robot.keyPress(KeyEvent.VK_R);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_R);
  Thread.sleep(x);
}else if (bufferarray[i].equals("F#")){
  robot.keyPress(KeyEvent.VK_5);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_5);
  Thread.sleep(x);
}else if (bufferarray[i].equals("G")){
  robot.keyPress(KeyEvent.VK_T);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_T);
  Thread.sleep(x);
}else if (bufferarray[i].equals("G#")){
  robot.keyPress(KeyEvent.VK_6);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_6);
  Thread.sleep(x);
}else if(bufferarray[i].equals("A+1")){
  robot.keyPress(KeyEvent.VK_SHIFT);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_Y);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_Y);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_SHIFT);
  Thread.sleep(x);
}else if (bufferarray[i].equals("B+1")){
  robot.keyPress(KeyEvent.VK_SHIFT);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_U);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_U);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_SHIFT);
  Thread.sleep(x);
}else if (bufferarray[i].equals("Bb+1")){
  robot.keyPress(KeyEvent.VK_SHIFT);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_7);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_7);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_SHIFT);
  Thread.sleep(x);
}else if (bufferarray[i].equals("C+1")){
  robot.keyPress(KeyEvent.VK_SHIFT);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_Q);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_Q);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_SHIFT);
  Thread.sleep(x);
}else if (bufferarray[i].equals("C#+1")){
  robot.keyPress(KeyEvent.VK_SHIFT);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_2);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_2);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_SHIFT);
  Thread.sleep(x);
}else if (bufferarray[i].equals("D+1")){
  robot.keyPress(KeyEvent.VK_SHIFT);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_W);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_W);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_SHIFT);
  Thread.sleep(x);
}else if (bufferarray[i].equals("Eb+1")){
  robot.keyPress(KeyEvent.VK_SHIFT);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_3);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_3);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_SHIFT);
  Thread.sleep(x);
}else if (bufferarray[i].equals("E+1")){
  robot.keyPress(KeyEvent.VK_SHIFT);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_E);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_E);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_SHIFT);
  Thread.sleep(x);
}else if (bufferarray[i].equals("F+1")){
  robot.keyPress(KeyEvent.VK_SHIFT);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_R);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_R);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_SHIFT);
  Thread.sleep(x);
}else if (bufferarray[i].equals("F#+1")){
  robot.keyPress(KeyEvent.VK_SHIFT);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_5);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_5);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_SHIFT);
  Thread.sleep(x);
}else if (bufferarray[i].equals("G+1")){
  robot.keyPress(KeyEvent.VK_SHIFT);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_T);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_T);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_SHIFT);
  Thread.sleep(x);
}else if (bufferarray[i].equals("G#+1")){
  robot.keyPress(KeyEvent.VK_SHIFT);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_6);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_6);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_SHIFT);
  Thread.sleep(x);
}else if(bufferarray[i].equals("A-1")){
  robot.keyPress(KeyEvent.VK_CONTROL);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_Y);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_Y);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(x);
}else if (bufferarray[i].equals("B-1")){
  robot.keyPress(KeyEvent.VK_CONTROL);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_U);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_U);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(x);
}else if (bufferarray[i].equals("Bb-1")){
  robot.keyPress(KeyEvent.VK_CONTROL);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_7);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_7);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(x);
}else if (bufferarray[i].equals("C-1")){
  robot.keyPress(KeyEvent.VK_CONTROL);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_Q);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_Q);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(x);
}else if (bufferarray[i].equals("C#-1")){
  robot.keyPress(KeyEvent.VK_CONTROL);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_2);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_2);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(x);
}else if (bufferarray[i].equals("D-1")){
  robot.keyPress(KeyEvent.VK_CONTROL);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_W);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_W);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(x);
}else if (bufferarray[i].equals("Eb-1")){
  robot.keyPress(KeyEvent.VK_CONTROL);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_3);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_3);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(x);
}else if (bufferarray[i].equals("E-1")){
  robot.keyPress(KeyEvent.VK_CONTROL);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_E);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_E);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(x);
}else if (bufferarray[i].equals("F-1")){
  robot.keyPress(KeyEvent.VK_CONTROL);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_R);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_R);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(x);
}else if (bufferarray[i].equals("F#-1")){
  robot.keyPress(KeyEvent.VK_CONTROL);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_5);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_5);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(x);
}else if (bufferarray[i].equals("G-1")){
  robot.keyPress(KeyEvent.VK_CONTROL);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_T);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_T);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(x);
}else if (bufferarray[i].equals("G#-1")){
  robot.keyPress(KeyEvent.VK_CONTROL);
  Thread.sleep(z);
  robot.keyPress(KeyEvent.VK_6);
  Thread.sleep(z);
  Thread.sleep(x*delayCount);
  delayCount=0;
  robot.keyRelease(KeyEvent.VK_6);
  Thread.sleep(z);
  robot.keyRelease(KeyEvent.VK_CONTROL);
  Thread.sleep(x);
}else if (bufferarray[i].equals("-")){
  try
  {
    Thread.sleep(55);
  }
  catch(InterruptedException e )
  {
  }
  }
   }






  }
}