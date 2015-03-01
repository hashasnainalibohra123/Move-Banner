import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class movebanner extends JComponent implements Runnable
{
JFrame jfrm;
JPanel panel;
JLabel l1,l2,l3,l4;
Thread t=null;
JLabel a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19;
JLabel b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
String s=" HASNAIN ALI BOHRA ";
Font f;
char c3[]=new char[50];
String s1=" BOHRA ALI HASNAIN ";

String s2=" BOHRA ALI HASNAIN ";

String s3=" HASNAIN ALI BOHRA ";

public static void main(String agrs[])
{
	SwingUtilities.invokeLater(new Runnable()
	{
		public void run()
		{
			movebanner m=new movebanner();
			m.create();
		
		}
	
	});

}

public void create()
{
	 t=new Thread(this,"hasnain ");
	jfrm=new JFrame("MOVE BANNER");
	jfrm.setSize(1600,1600);
	jfrm.setVisible(true);
	jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
	jfrm.setLayout(null);
	panel=new JPanel();
	panel.setLayout(null);
	panel.setBackground(Color.blue);
	panel.setBounds(10,10,1500,1500);
	jfrm.add(panel);
	l1=new JLabel();
	l2=new JLabel();
	l3=new JLabel();
	l4=new JLabel();
	l1.setVerticalAlignment(JLabel.TOP);
	l3.setVerticalAlignment(JLabel.TOP);
	l2.setVerticalAlignment(JLabel.TOP);
 //l2.setVirticalTextPosition();	
	l1.setBounds(250,50,450,30);
	l4.setBounds(250,560,450,30);
	panel.add(l1);
	panel.add(l2);
	panel.add(l3);
	panel.add(l4);
	f=new Font("Lucida Handwriting",Font.PLAIN,16);
		
		
	  	
	l1.setBackground(Color.black);
	l4.setBackground(Color.red);
	l1.setFont(f);
	l4.setFont(f);
		a1=new JLabel();
		a2=new JLabel();
	a3=new JLabel();
	a4=new JLabel();
	a5=new JLabel();
	a6=new JLabel();
	a7=new JLabel();
	a8=new JLabel();
	a9=new JLabel();
	a10=new JLabel();
	a11=new JLabel();
	a12=new JLabel();
	a13=new JLabel();
	a14=new JLabel();
	a15=new JLabel();
	a16=new JLabel();
	a17=new JLabel();
	a18=new JLabel();
	a19=new JLabel();
b1=new JLabel();
		b2=new JLabel();
	b3=new JLabel();
	b4=new JLabel();
	b5=new JLabel();
	b6=new JLabel();
	b7=new JLabel();
b8=new JLabel();
	b9=new JLabel();
	b10=new JLabel();
	b11=new JLabel();
	b12=new JLabel();
	b13=new JLabel();
	b14=new JLabel();
	b15=new JLabel();
	b16=new JLabel();
	b17=new JLabel();
	b18=new JLabel();
	b19=new JLabel();

	f=new Font("Lucida Handwriting",Font.PLAIN,16);
		
	a1.setFont(f);
		a2.setFont(f);
		a3.setFont(f);
		a4.setFont(f);
		a5.setFont(f);
		a6.setFont(f);
		a7.setFont(f);
		a8.setFont(f);
		a9.setFont(f);
		a10.setFont(f);
		a11.setFont(f);
		a12.setFont(f);
		a13.setFont(f);
	a14.setFont(f);
	a15.setFont(f);
	a16.setFont(f);
	a17.setFont(f);
	a18.setFont(f);
	a19.setFont(f);
	
	
	
	b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		b5.setFont(f);
		b6.setFont(f);
		b7.setFont(f);
		b8.setFont(f);
		b9.setFont(f);
		b10.setFont(f);
		b11.setFont(f);
		b12.setFont(f);
		b13.setFont(f);
	b14.setFont(f);
	b15.setFont(f);
	b16.setFont(f);
	b17.setFont(f);
	b18.setFont(f);
	b19.setFont(f);
	
	
	
a1.setBounds(150,150,50,20);
a2.setBounds(150,171,50,20);
a3.setBounds(150,192,50,20);
a4.setBounds(150,213,50,20);
a5.setBounds(150,234,50,20);
a6.setBounds(150,255,50,20);
a7.setBounds(150,276,50,20);
a8.setBounds(150,297,50,20);
a9.setBounds(150,318,50,20);
a10.setBounds(150,339,50,20);
a11.setBounds(150,360,50,20);
a12.setBounds(150,381,50,20);
a13.setBounds(150,402,50,20);
a14.setBounds(150,423,50,20);
a15.setBounds(150,444,50,20);
a16.setBounds(150,465,50,20);
a17.setBounds(150,486,50,20);
a18.setBounds(150,507,50,20);
a19.setBounds(150,529,50,20);
panel.add(a1);
panel.add(a2);
panel.add(a3);
panel.add(a4);
panel.add(a5);
panel.add(a6);
panel.add(a7);
panel.add(a8);
panel.add(a9);
panel.add(a10);
panel.add(a11);
panel.add(a12);
panel.add(a13);
panel.add(a14);
panel.add(a15);
panel.add(a16);
panel.add(a17);
panel.add(a18);
panel.add(a19);
panel.add(b1);
panel.add(b2);
panel.add(b3);
panel.add(b4);
panel.add(b5);
panel.add(b6);
panel.add(b7);
panel.add(b8);
panel.add(b9);
panel.add(b10);
panel.add(b11);
panel.add(b12);
panel.add(b13);
panel.add(b14);
panel.add(b15);
panel.add(b16);
panel.add(b17);
panel.add(b18);
panel.add(b19);

	t.start();
	}
	
	public void run()
	{

for(;;)
{

	try{
		char []h=new char[50];
		for(int i=0;i<s2.length();i++)
		{
		
			h[i]=s.charAt(i);
			
			}
		
			t.sleep(250);
			char ch= s.charAt(0);
			s=s.substring(1,s.length());
			s=s+ch;
			l1.setText(s);
			ch= s1.charAt((s1.length()-1));
			s1=s1.substring(0,(s1.length()-1));
			s1=ch+s1;
			s3="";
			for(int i=0;i<s2.length();i++)
			{
				s3=s3+h[i]+"\n";
				
			//System.out.println(s3);
			}
			for(int i=0;i<s2.length();i++)
			{
				c3[i]=s1.charAt(i);
						System.out.println(c3[i]);
	
			}
			System.out.println(s1);
			l4.setText(s1);
			a1.setText(c3[1]+"");
			a2.setText(c3[2]+"");
			a3.setText(c3[3]+"");
			a4.setText(c3[4]+"");
			a5.setText(c3[5]+"");
			a6.setText(c3[6]+"");
			a7.setText(c3[7]+"");
			a8.setText(c3[8]+"");
			a9.setText(c3[9]+"");
			a10.setText(c3[10]+"");
			a11.setText(c3[11]+"");
			a12.setText(c3[12]+"");
			a13.setText(c3[13]+"");
			a14.setText(c3[14]+"");
			a15.setText(c3[15]+"");
			a16.setText(c3[16]+"");
			a17.setText(c3[17]+"");
			a18.setText(c3[18]+"");
			a19.setText(c3[19]+"");
			
			
			
			
			
			
	
b1.setBounds(550,150,50,20);
b2.setBounds(550,171,50,20);
b3.setBounds(550,192,50,20);
b4.setBounds(550,213,50,20);
b5.setBounds(550,234,50,20);
b6.setBounds(550,255,50,20);
b7.setBounds(550,276,50,20);
b8.setBounds(550,297,50,20);
b9.setBounds(550,318,50,20);
b10.setBounds(550,339,50,20);
b11.setBounds(550,360,50,20);
b12.setBounds(550,381,50,20);
b13.setBounds(550,402,50,20);
b14.setBounds(550,423,50,20);
b15.setBounds(550,444,50,20);
b16.setBounds(550,465,50,20);
b17.setBounds(550,486,50,20);
b18.setBounds(550,507,50,20);
b19.setBounds(550,529,50,20);
			for(int i=0;i<s2.length();i++)
			{
				s3=s3+h[i]+"\n";
				
			//System.out.println(s3);
			}
			for(int i=0;i<s2.length();i++)
			{
				c3[i]=s.charAt(i);
						System.out.println(c3[i]);
	
			}
			System.out.println(s1);
			l4.setText(s1);
			b1.setText(c3[1]+"");
			b2.setText(c3[2]+"");
			b3.setText(c3[3]+"");
			b4.setText(c3[4]+"");
			b5.setText(c3[5]+"");
			b6.setText(c3[6]+"");
			b7.setText(c3[7]+"");
			b8.setText(c3[8]+"");
			b9.setText(c3[9]+"");
			b10.setText(c3[10]+"");
			b11.setText(c3[11]+"");
			b12.setText(c3[12]+"");
			b13.setText(c3[13]+"");
			b14.setText(c3[14]+"");
			b15.setText(c3[15]+"");
			b16.setText(c3[16]+"");
			b17.setText(c3[17]+"");
			b18.setText(c3[18]+"");
			b19.setText(c3[19]+"");
			
			
			
			
			
			}
			catch(Exception e){
								
									System.out.println(e);
			
							  }
}//for	
}
	

}