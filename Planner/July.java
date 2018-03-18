import java.applet.Applet; 
import java.awt.*; 
import javax.swing.*;
import java.awt.geom.*;

class Calendar{

String monthName;
String[ ] dayName= new String[31];//worst case
int[ ]   dayNo = new int[31];

Calendar(String monthName1, String[ ] dayName1, int[ ] dayNo1){
monthName=monthName1;
dayName= dayName1;
dayNo=dayNo1;
}

}

public class July extends Applet{
  static String strMonth="";
String[ ] months= {
                  " ",
	"January  ",
	"February ",
	"March    ",
	"April    ",
	"May      ",
	"June     ",
	"July     ",
	"August   ",
	"September",
	"October  ",
	"November ",
	"December "
};
int[ ] daysInMonths={0,31,29,31,30,31,30,31,31,30,31,30,31};
String[] dayName={"Mon", "Tue", "Wed", "Thu","Fri", "Sat", "Sun"};
String[ ] dayNameEntireMonth1= new String[31];
int[ ] dayNo1 = new int[31];







    public  void paint(Graphics g) {
    Graphics2D g1 = (Graphics2D) g;
    g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
    int monthToDisplay = 7; //change here
    example(g);
    firstPage(g, monthToDisplay);
    design(g);
  }


   public void firstPage(Graphics g, int monthToDisplay) {
      Calendar [ ] obj = new Calendar[13];

     //Sample values for first month i.e January 2016
     /*obj[0].monthName="January";
     obj[0].dayName[0]="Fri";
    obj[0].dayNo[0]=1;*/
    
    //This means dayNameIndex is 4

    //We would use parameterize constructor to assign values

    int month, day, dayNameIndex;
    dayNameIndex=4;
    String str="";
    for(month =1; month<=12; month++) {
      dayNameEntireMonth1 = new String[31];
      for(day=1; day<= daysInMonths[month]; ++day) {
        dayNameEntireMonth1[day-1]= dayName[dayNameIndex];
        dayNo1[day-1] = day;
         dayNameIndex++;
         if(dayNameIndex==7)
             dayNameIndex=0;
    
      }
         obj[month] = new Calendar(months[month], dayNameEntireMonth1, dayNo1);
    }//for outer
    int i;
 

     int row=1;
     int col=0;
     int pos_x, pos_y;//pos_y=row*70+3; pos_x=col*100+33
    
     month=monthToDisplay;
   
	
      int fontSize = 24;
      g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
      g.setColor(Color.BLACK);
      strMonth = obj[month].monthName;
      g.drawString(strMonth, 30, 30);
      fontSize = 14;
      g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
      g.setColor(Color.BLACK);
      for ( day = 1; day <= daysInMonths[month]; day++ )
         {   
            if(obj[month].dayName[day-1].equals("Sat")){
               pos_y=row*70+12;
               pos_x=33;
               g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
               //break;
            }//if
            else if(obj[month].dayName[day-1].equals("Sun")){
               pos_y=row*70+12;
               pos_x=133;
               g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
                row++;
               if(row==6)
               row=1;
            }
       }//for
   //Calendar in SMALL FONTS
       String strMonth1="";
       String strMonth2 = "";
       int month2=-1;
if(month==12){//display Jan 2017
 //Sample values for first month i.e January 2017
     obj[1].monthName="January";
     obj[1].dayName[1]="Sun";
     obj[1].dayNo[0]=1;
     dayNameIndex=6;

     
        dayNameEntireMonth1 = new String[31];
        for(day=1; day<= daysInMonths[month]; ++day) {
           dayNameEntireMonth1[day-1]= dayName[dayNameIndex];
           dayNo1[day-1] = day;
           dayNameIndex++;
           if(dayNameIndex==7)
              dayNameIndex=0;
    
     }
         obj[1] = new Calendar(months[month], dayNameEntireMonth1, dayNo1);
      month--;
      strMonth1=obj[month].monthName;
      month2 = 1;
       strMonth2= "January 2017";
       
 }//if(month==12)
  else if (month == 1) { //display DEC 2015
//Sample values for first month i.e DEC 15
      obj[12].monthName = "December ";
      obj[12].dayName[0] = "Tue";
      obj[12].dayNo[0] = 1;
      dayNameIndex = 1;
        dayNameEntireMonth1 = new String[31];
        for (day = 1; day <= daysInMonths[month]; ++day) {
          dayNameEntireMonth1[day - 1] = dayName[dayNameIndex];
          dayNo1[day - 1] = day;
          dayNameIndex++;
          if (dayNameIndex == 7)
            dayNameIndex = 0;

        }
        obj[12] = new Calendar(months[month], dayNameEntireMonth1, dayNo1);

        month = 12;         
        strMonth1 = "December 2015";
        month2 = 2;
        strMonth2  = obj[month2].monthName;
    }//if(month==12)
  else{
        month2 = month + 1;
        month--;
        strMonth1 = obj[month].monthName;
        strMonth2  = obj[month2].monthName;
      }

 row = 1;
 col = 0;
 int rowInc=0;
 {
     //Font for month name; small fonts calendar
    fontSize = 9;
    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
    g.setColor(Color.BLACK);
    
      g.drawString(strMonth1, 30, 455);
      g.drawString(strMonth2, 150, 455);
      //day letters
      int x = 33;
      for (int l = 0; l < dayName.length; ++l) {
        String s = "" + dayName[l].charAt(0);
        g.setColor(Color.RED);
        g.drawString(s, x, 470);
        x += 15;
      }
      x = 153;
      for (int l = 0; l < dayName.length; ++l) {
        String s = "" + dayName[l].charAt(0);
        g.drawString(s, x, 470);
        x += 15;
      }
      g.setColor(Color.BLACK);
      for ( day = 1; day <= daysInMonths[month]; day++ )
         {   
             if(obj[month].dayName[day-1].equals("Mon")){
                   pos_y=485+rowInc;
                   pos_x=30;
                   g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
                   //break;
               }//if
               else if(obj[month].dayName[day-1].equals("Tue")){
                   pos_y=485+rowInc;;
                   pos_x=45;
                   g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
               }
               else if(obj[month].dayName[day-1].equals("Wed")){
                          pos_y=485+rowInc;;
                          pos_x=60;
                         g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
               }
               else if(obj[month].dayName[day-1].equals("Thu")){
                     pos_y=485+rowInc;;
                     pos_x=75;
                     g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
               }
               else if(obj[month].dayName[day-1].equals("Fri")){
                     pos_y=485+rowInc;;
                     pos_x=90;
                     g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
                }
                else if(obj[month].dayName[day-1].equals("Sat")){
                     pos_y=485+rowInc;;
                     pos_x=105;
                     g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
                }
               else if(obj[month].dayName[day-1].equals("Sun")){
                     pos_y=485+rowInc;;
                     pos_x=120;
                     g.drawString(" " +obj[month].dayNo[day-1], pos_x, pos_y);
                     row++;
                     rowInc= rowInc+10;
                     if(row==6){
	      row=1;
	      rowInc=0;
                     }
                }//else if
            }//for 
          }
          row = 1;
 col = 0;
 rowInc=0;
 {
for ( day = 1; day <= daysInMonths[month2]; day++ )
         {   
             if(obj[month2].dayName[day-1].equals("Mon")){
                   pos_y=485+rowInc;
                   pos_x=150;
                   g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
                   //break;
               }//if
               else if(obj[month2].dayName[day-1].equals("Tue")){
                   pos_y=485+rowInc;;
                   pos_x=165;
                   g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
               }
               else if(obj[month2].dayName[day-1].equals("Wed")){
                          pos_y=485+rowInc;;
                          pos_x=180;
                         g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
               }
               else if(obj[month2].dayName[day-1].equals("Thu")){
                     pos_y=485+rowInc;;
                     pos_x=195;
                     g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
               }
               else if(obj[month2].dayName[day-1].equals("Fri")){
                     pos_y=485+rowInc;;
                     pos_x=210;
                     g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
                }
                else if(obj[month2].dayName[day-1].equals("Sat")){
                     pos_y=485+rowInc;;
                     pos_x=225;
                     g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
                }
               else if(obj[month2].dayName[day-1].equals("Sun")){
                     pos_y=485+rowInc;;
                     pos_x=240;
                     g.drawString(" " +obj[month2].dayNo[day-1], pos_x, pos_y);
                     row++;
                     rowInc= rowInc+10;
                     if(row==6){
        row=1;
        rowInc=0;
                     }
                }//else if
            }//for 
    }//block rowInc
     
  }
 

public void example(Graphics g) {

  g.drawLine(30, 70, 230, 70);
  g.drawLine(30, 70, 30, 420);
  g.drawLine(30, 420, 230, 420);
  g.drawLine(230, 420, 230, 70);

  g.drawLine(130, 70, 130, 420);
  //columns
  g.drawLine(30, 140, 230, 140);
  g.drawLine(30, 210, 230, 210);
  g.drawLine(30, 280, 230, 280);
  g.drawLine(30, 350, 230, 350);
  //rows
  /*g.drawLine(270, 70, 270, 420);
  g.drawLine(270, 420, 530, 420);
  g.drawLine(270, 70, 530, 70);
  g.drawLine(530, 70, 530, 420);*/




  int fontSize = 20;

  g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));

  g.setColor(Color.red);
  g.drawString("Saturday", 30, 50);
  g.drawString("Sunday", 130, 50);
  /*g.drawString("Wednesday", 230, 50);
  g.drawString("Thursday",330, 50);
  g.drawString("Friday", 430, 50);*/
}
public void design(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    g2.scale(0.8,0.63);
    g.translate(220,57);

    //Colors 
    Color bGreen = new Color(61,224,175);
    Color dGreen = new Color(10,209,93);
    Color dRed = new Color(222,89,89);
    Color lPink = new Color(223,185,237);
    Color peachFB = new Color(201,148,133);
    Color orangeFB = new Color(250,151,122);

    //frame and background
    g.setColor(peachFB);
    g.fillRect(110,60,380,550);
    g.setColor(Color.BLACK);
    g.drawRect(110,60,380,550);
    g.drawRect(109,59,382,552);
    g.drawRect(108,58,384,554);   
    g.setColor(orangeFB);
    g.fillRect(130,80,340,510);
    g.setColor(Color.BLACK);
    g.drawRect(130,80,340,510);
    g.drawRect(129,79,342,512);
    g.drawRect(128,78,344,514);

    
    //1st line 1st box
    int[] x ={200,280,240,160,200};
    int[] y ={110,110,260,260,110};
    g.setColor(dGreen);
    g.fillPolygon(x,y,5);

    

    //1st line 2nd box
    int[] x1 ={280,360,320,240,280};
    int[] y1 ={110,110,260,260,110};
    g.setColor(bGreen);
    g.fillPolygon(x1,y1,5);
    
    //1st line 3rd box
    int[] x2 ={360,440,400,320,360};
    int[] y2 ={110,110,260,260,110};
    g.setColor(dRed);
    g.fillPolygon(x2,y2,5);
    
    //2nd line 1st box
    int[] x3 ={160,240,280,200,160};
    int[] y3 ={260,260,410,410,260};
    g.setColor(lPink);
    g.fillPolygon(x3,y3,5);

    //2nd line 2nd box
    int[] x4 ={240,320,360,280,240};
    int[] y4 ={260,260,410,410,260};
    g.setColor(dGreen);
    g.fillPolygon(x4,y4,5);

    //2nd line 3rd box
    int[] x5 ={320,400,440,360,320};
    int[] y5 ={260,260,410,410,260};
    g.setColor(lPink);
    g.fillPolygon(x5,y5,5);

    //3rd line 1st box
    int[] x6 ={200,280,240,160,200};
    int[] y6 ={410,410,560,560,410};
    g.setColor(dRed);
    g.fillPolygon(x6,y6,5);

    //3rd line 2nd box
    int[] x7 ={280,360,320,240,280};
    int[] y7 ={410,410,560,560,410};
    g.setColor(bGreen);
    g.fillPolygon(x7,y7,5);

    //3rd line 3rd box
    int[] x8 ={360,440,400,320,360};
    int[] y8 ={410,410,560,560,410};
    g.setColor(dGreen);
    g.fillPolygon(x8,y8,5);

    //outlining
    g.setColor(Color.BLACK);
    g.drawLine(200,110,440,110);
    g.drawLine(199,109,441,109);

    g.drawLine(200,110,160,260);
    g.drawLine(199,109,159,259);

    g.drawLine(160,260,400,260);
    g.drawLine(159,259,401,259);

    g.drawLine(400,260,440,110);
    g.drawLine(401,259,441,109);

    g.drawLine(280,110,240,260);
    g.drawLine(279,109,239,259);

    g.drawLine(360,110,320,260);
    g.drawLine(359,109,319,259);

    g.drawLine(160,260,200,410);
    g.drawLine(159,259,199,411);

    g.drawLine(440,410,400,260);
    g.drawLine(441,409,401,259);

    g.drawLine(240,260,280,410);
    g.drawLine(241,259,281,409);

    g.drawLine(320,260,360,410);
    g.drawLine(321,259,361,409);

    g.drawLine(200,410,440,410);
    g.drawLine(199,409,441,409);

    g.drawLine(200,410,160,560);
    g.drawLine(199,409,159,559);

    g.drawLine(160,560,400,560);
    g.drawLine(159,559,401,559);

    g.drawLine(400,560,440,410);
    g.drawLine(401,559,441,409);

    g.drawLine(280,410,240,560);
    g.drawLine(279,409,239,559);

    g.drawLine(360,410,320,560);
    g.drawLine(359,409,319,559);

    //MONTH NAME
    {
      GraphicsConfiguration gc = g2.getDeviceConfiguration();
      g2.setTransform(gc.getDefaultTransform());

      g.setColor(Color.BLACK);
      g.setFont(new Font("Arial", Font.BOLD, 35));
      g.drawString("NOTE:",30,580);
      int yl=610;
      for(int i=0;i<3;i++){
      g.drawLine(30,yl,600,yl);
      yl+=30;
    }

      int yax=210;
      g.setColor(peachFB);
      g.setFont(new Font("Algerian", Font.PLAIN,40));
      for(int l=0;l<strMonth.length();++l){
      g.drawString(""+Character.toUpperCase(strMonth.charAt(l)),580,yax);
      yax+=40;
    }

    g.setColor(Color.BLACK);
    g.setFont(new Font("Times Roman", Font.BOLD,14));
    g.drawString("Muzammil",320,470);
    g.drawString("Sufyan",320,490);
    g.drawString("Hamza Ali",320,510);
    g.drawString("Basim",320,530);
    //LOGO
    {
    Image  image = getImage(getCodeBase(),
               "emblem.png");
    g.drawImage(image, 450, 440, 120, 120, this);
  }
    }
  }
}