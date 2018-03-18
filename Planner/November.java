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

public class December extends Applet{
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
    g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    int monthToDisplay = 12; //change here
    example(g);
    firstPage(g, monthToDisplay);
    drawUmbrella(g);
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
public void drawUmbrella(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    Color color1;
    Color color2;
    int r, gr, b;
    //MOVE GRAPHICS FROM HERE
    int horizontal=0;//increase to move right
    int vertical=0;//increase to move down

    g.translate(horizontal,vertical);
    g.setColor(Color.BLACK);
    g.fillRect(210, 70, 440, 350);

    g.setColor(new Color(255,144,0));
    g.fillRect(215, 75, 430, 340);
    g2.rotate(1.8, 429, 320.0);
    int i = 0;
    for (i = 0; i < 13; ++i) {
      g2.rotate(-.3 * i, 429, 320.0);

      //mid
      {
        r = (int)Math.round(Math.random() * 255);
        gr = (int)Math.round(Math.random() * 255);
        b = (int)Math.round(Math.random() * 255);
        g.setColor(new Color(r, gr, b));
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(429, 245);
        path.quadTo(416.0, 236.5, 414.5, 225.0);
        path.quadTo(414.5, 201.0, 429.0, 199.0);
        path.closePath();
        g2.fill(path);

      }{
        if (r >= 128)
          r = r + 10 - 30;
        else
          r = r + 30;
        if (gr >= 128)
          gr = gr + 10 - 30;
        else
          gr = gr + 30;
        if (b >= 128)
          b = b + 10 - 30;
        else
          b = b + 30;
        g.setColor(new Color(r, gr, b));
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(429, 199);
        path.quadTo(444.5, 201.0, 444.5, 225.0);
        path.quadTo(442.0, 236.5, 429.0, 245.0);
        path.closePath();
        g2.fill(path); r = (int)Math.round(Math.random() * 255);
        gr = (int)Math.round(Math.random() * 255);
        b = (int)Math.round(Math.random() * 255);
        g.setColor(new Color(r, gr, b));
        g.fillArc(419, 210, 20, 20, 270, 180);
        if (r >= 128)
          r = r + 10 - 30;
        else
          r = r + 30;
        if (gr >= 128)
          gr = gr + 10 - 30;
        else
          gr = gr + 30;
        if (b >= 128)
          b = b + 10 - 30;
        else
          b = b + 30;
        g.setColor(new Color(r, gr, b));
        g.fillArc(419, 210, 20, 20, 90, 180);
      }
      //bottom
      {
        g.translate(0, 23);
        g.translate(10, 7); r = (int)Math.round(Math.random() * 255);
        gr = (int)Math.round(Math.random() * 255);
        b = (int)Math.round(Math.random() * 255);
        g.setColor(new Color(r, gr, b));
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(425, 262.5);
        path.quadTo(416.0, 259.0, 417, 251.0);
        path.quadTo(416.75, 241.5, 425.0, 238.5);
        path.closePath();
        g2.fill(path);
      }{
        if (r >= 128)
          r = r + 10 - 30;
        else
          r = r + 30;
        if (gr >= 128)
          gr = gr + 10 - 30;
        else
          gr = gr + 30;
        if (b >= 128)
          b = b + 10 - 30;
        else
          b = b + 30;
        g.setColor(new Color(r, gr, b));
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(425, 238.5);
        path.quadTo(434.75, 240.75, 434, 252.75);
        path.quadTo(434.5, 259, 425, 262.5);
        path.closePath();
        g2.fill(path);

        g.translate(-10, -7);
        r = (int)Math.round(Math.random() * 255);
        gr = (int)Math.round(Math.random() * 255);
        b = (int)Math.round(Math.random() * 255);
        g.setColor(new Color(r, gr, b));
        g.fillArc(430, 252, 10, 10, 270, 180);
        if (r >= 128)
          r = r + 10 - 30;
        else
          r = r + 30;
        if (gr >= 128)
          gr = gr + 10 - 30;
        else
          gr = gr + 30;
        if (b >= 128)
          b = b + 10 - 30;
        else
          b = b + 30;
        g.setColor(new Color(r, gr, b));
        g.fillArc(430, 252, 10, 10, 90, 180);

        g.translate(0, -23);
      }
      //bottom
      {
        g.translate(10, 7); r = (int)Math.round(Math.random() * 255);
        gr = (int)Math.round(Math.random() * 255);
        b = (int)Math.round(Math.random() * 255);
        g.setColor(new Color(r, gr, b));
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(425, 262.5);
        path.quadTo(416.0, 259.0, 417, 251.0);
        path.quadTo(416.75, 241.5, 425.0, 238.5);
        path.closePath();
        g2.fill(path);
      }{
        if (r >= 128)
          r = r + 10 - 30;
        else
          r = r + 30;
        if (gr >= 128)
          gr = gr + 10 - 30;
        else
          gr = gr + 30;
        if (b >= 128)
          b = b + 10 - 30;
        else
          b = b + 30;
        g.setColor(new Color(r, gr, b));
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(425, 238.5);
        path.quadTo(434.75, 240.75, 434, 252.75);
        path.quadTo(434.5, 259, 425, 262.5);
        path.closePath();
        g2.fill(path);

        g.translate(-10, -7);
        r = (int)Math.round(Math.random() * 255);
        gr = (int)Math.round(Math.random() * 255);
        b = (int)Math.round(Math.random() * 255);
        g.setColor(new Color(r, gr, b));
        g.fillArc(430, 252, 10, 10, 270, 180);
        if (r >= 128)
          r = r + 10 - 30;
        else
          r = r + 30;
        if (gr >= 128)
          gr = gr + 10 - 30;
        else
          gr = gr + 30;
        if (b >= 128)
          b = b + 10 - 30;
        else
          b = b + 30;
        g.setColor(new Color(r, gr, b));
        g.fillArc(430, 252, 10, 10, 90, 180);

      }

      g2.rotate(.3 * i, 429, 320.0);
    }//for Loop
    //ek aur loop
    for (i = 0; i < 19; ++i) {
      g2.rotate(-.2 * i, 429, 320.0);
      //not mid
      {

        g.translate(11, -42);
        r = (int)Math.round(Math.random() * 255);
        gr = (int)Math.round(Math.random() * 255);
        b = (int)Math.round(Math.random() * 255);

        g.setColor(new Color(r, gr, b));
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(429, 245);
        path.quadTo(416.0, 236.5, 414.5, 225.0);
        path.quadTo(414.5, 201.0, 429.0, 199.0);
        path.closePath();
        g2.fill(path);
      }{
        if (r >= 128)
          r = r + 10 - 30;
        else
          r = r + 30;
        if (gr >= 128)
          gr = gr + 10 - 30;
        else
          gr = gr + 30;
        if (b >= 128)
          b = b + 10 - 30;
        else
          b = b + 30;
        g.setColor(new Color(r, gr, b));
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(429, 199);
        path.quadTo(444.5, 201.0, 444.5, 225.0);
        path.quadTo(442.0, 236.5, 429.0, 245.0);
        path.closePath();
        g2.fill(path);
        r = (int)Math.round(Math.random() * 255);
        gr = (int)Math.round(Math.random() * 255);
        b = (int)Math.round(Math.random() * 255);
        g.setColor(new Color(r, gr, b));
        g.fillArc(419, 210, 20, 20, 270, 180);
        if (r >= 128)
          r = r + 10 - 30;
        else
          r = r + 30;
        if (gr >= 128)
          gr = gr + 10 - 30;
        else
          gr = gr + 30;
        if (b >= 128)
          b = b + 10 - 30;
        else
          b = b + 30;
        g.setColor(new Color(r, gr, b));
        g.fillArc(419, 210, 20, 20, 90, 180);

        g.translate(-11, 42);
      }
      //top
      {
        g.translate(10, 7);
        r = (int)Math.round(Math.random() * 255);
        gr = (int)Math.round(Math.random() * 255);
        b = (int)Math.round(Math.random() * 255);
        g.setColor(new Color(r, gr, b));
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(426, 150);
        path.quadTo(407.5, 143.0, 407, 127.0);
        path.quadTo(409.5, 102.0, 426.0, 99.0);
        path.closePath();
        g2.fill(path);
      }{
        if (r >= 128)
          r = r + 10 - 30;
        else
          r = r + 30;
        if (gr >= 128)
          gr = gr + 10 - 30;
        else
          gr = gr + 30;
        if (b >= 128)
          b = b + 10 - 30;
        else
          b = b + 30;
        g.setColor(new Color(r, gr, b));
        GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path.moveTo(426, 99);
        path.quadTo(440, 97.0, 444, 126.5);
        path.quadTo(443.5, 141, 426, 150);
        path.closePath();
        g2.fill(path);

        g.translate(-10, -7);
        r = (int)Math.round(Math.random() * 255);
        gr = (int)Math.round(Math.random() * 255);
        b = (int)Math.round(Math.random() * 255);
        g.setColor(new Color(r, gr, b));
        g.fillArc(425, 118, 22, 22, 270, 180);
        if (r >= 128)
          r = r + 10 - 30;
        else
          r = r + 30;
        if (gr >= 128)
          gr = gr + 10 - 30;
        else
          gr = gr + 30;
        if (b >= 128)
          b = b + 10 - 30;
        else
          b = b + 30;
        g.setColor(new Color(r, gr, b));
        g.fillArc(425, 118, 22, 22, 90, 180);
      }


      g2.rotate(.2 * i, 429, 320.0);
    }

    g2.rotate(-1.8, 429, 320.0);
    //
    //body
    {
      g.translate(-40, 0);
      GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
      path.moveTo(453, 217);
      path.quadTo(471.0, 202.5, 475, 225.0);
      path.lineTo(485, 356);
      path.lineTo(479, 368);
      path.lineTo(480, 401);
      path.lineTo(495, 408);
      path.lineTo(482, 407);
      path.lineTo(488, 418);
      path.lineTo(477, 406);
      path.lineTo(470, 411);
      path.lineTo(478, 402);
      path.lineTo(476, 382);
      path.lineTo(473, 374);
      path.lineTo(475, 368);
      path.lineTo(472, 362);
      path.lineTo(466, 362);
      path.lineTo(463, 369);
      path.lineTo(465, 375);
      path.lineTo(461, 388);
      path.lineTo(461, 402);
      path.lineTo(467, 411);
      path.lineTo(460, 406);
      path.lineTo(450, 417);
      path.lineTo(455, 406);
      path.lineTo(443, 408);
      path.lineTo(458, 403);
      path.lineTo(459, 368);
      path.lineTo(454, 358);
      path.quadTo(425, 344, 444, 293);
      path.quadTo(468, 255, 459, 230);
      path.lineTo(453, 224);
      path.lineTo(453, 217);
      path.closePath();
      g.setColor(new Color(14, 32, 72));
      g2.fill(path);
      //light side
      GeneralPath path1 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
      path1.moveTo(476, 251);
      path1.quadTo(529, 352, 472, 361);
      path1.quadTo(425, 351, 450, 299);
      path1.quadTo(477, 262, 476, 251);
      path1.closePath();
      g.setColor(new Color(22, 65, 118));
      g2.fill(path1);

      //beak

      {
        GeneralPath path2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path2.moveTo(453, 217);
        path2.quadTo(444, 217, 441, 221);
        path2.quadTo(450, 221, 454, 225);
        path2.closePath();
        g.setColor(Color.WHITE);
        g2.fill(path2);
      }
      //eye
      {
        GeneralPath path2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path2.moveTo(453, 222);
        path2.quadTo(459, 213, 470, 218);
        path2.quadTo(468, 230, 453, 222);
        path2.closePath();
        g2.fill(path2);
      }

      //iris
      {
        GeneralPath path2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path2.moveTo(468, 218);
        path2.lineTo(466, 219);
        path2.quadTo(466, 224, 457, 224);
        path2.quadTo(456, 218, 464, 218);
        path2.lineTo(468, 218);
        path2.closePath();
        g.setColor(Color.BLACK);
        g2.fill(path2);
      }
      //crown
      {
        GeneralPath path2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
        path2.moveTo(467, 214);
        path2.quadTo(470, 209, 475, 212);
        path2.quadTo(482, 220, 473, 217);
        path2.lineTo(467, 214);
        path2.closePath();
        g2.fill(path2);

        //string of crown
        int xp[] = {473, 484, 482, 473, 493, 490, 475, 503, 489, 475, 503, 488, 475};
        int yp[] = {212, 193, 204, 213, 192, 204, 214, 196, 209, 215, 208, 216, 216};
        g.drawPolyline(xp, yp, xp.length);
      }

      g.translate(40, 0);

    }
    g.translate(-horizontal,-vertical);
    //MONTH NAME
    { 
      g.setColor(Color.BLACK);
      g.setFont(new Font("Arial", Font.BOLD, 35));
      g.drawString("NOTE:",30,580);
      int yl=610;
      for(i=0;i<3;i++){
      g.drawLine(30,yl,660,yl);
      yl+=30;
    }
      int yax=120;
      g.setColor(Color.BLACK);
      g.setFont(new Font("Algerian", Font.PLAIN,40));
      for(int l=0;l<strMonth.length();++l){
      g.drawString(""+Character.toUpperCase(strMonth.charAt(l)),650,yax);
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
    g.drawImage(image, 520, 440, 120, 120, this);
  }
    }
  }
}