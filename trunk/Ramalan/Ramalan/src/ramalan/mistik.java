
package ramalan;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class mistik extends JFrame
{
   mistik()
    {
      setTitle("Ramalan Bintang");
      setLocation(300,200);
      setSize(350, 300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
    }
    void komponen()
    {
        //membuat label
          JLabel tgl=new JLabel("Tanggal lahir");
        JLabel bln=new JLabel("Bulan lahir");
        JLabel z=new JLabel("Zodiak Anda");
        JLabel um=new JLabel("Umum");
        JLabel p=new JLabel("Keuangan");
        JLabel c=new JLabel("Cinta");
        JLabel rm=new JLabel("Ramalan anda :");
        JLabel mon=new JLabel("Bulan");
        //font label
        tgl.setFont(new Font("comic sans MS",Font.BOLD,14));
        bln.setFont(new Font("comic sans MS",Font.BOLD,14));
        z.setFont(new Font("comic sans MS",Font.BOLD,14));
        um.setFont(new Font("comic sans MS",Font.BOLD,14));
        p.setFont(new Font("comic sans MS",Font.BOLD,14));
        c.setFont(new Font("comic sans MS",Font.BOLD,14));
        mon.setFont(new Font("comic sans MS",Font.BOLD,14));

        //membuat teks fild
        final JTextField tg=new JTextField(5);
        final JTextField bl=new JTextField(5);
        bl.setToolTipText("isi dengan angka");
        final JTextField zo=new JTextField(300);
        final JTextField u=new JTextField(300);
        final JTextField pek=new JTextField(300);
        final JTextField cin=new JTextField(300);
        final JTextField tb=new JTextField(25);
       //pengaturan font output
        zo.setFont(new Font("comic sans MS",Font.BOLD,20));
        u.setFont(new Font("comic sans MS",Font.ITALIC,13));
        pek.setFont(new Font("comic sans MS",Font.ITALIC,13));
        pek.setFont(new Font("comic sans MS",Font.ITALIC,13));
        cin.setFont(new Font("comic sans MS",Font.ITALIC,13));
        tb.setFont(new Font("arial MS",Font.BOLD,14));

        //membuat button
        JButton ramal=new JButton("Ramal");
        JButton hapus=new JButton("Hapus");
        JButton ex=new JButton("Exit");
        //warna font pada button
        ramal.setForeground(Color.BLUE);
        hapus.setForeground(Color.MAGENTA);
        ex.setForeground(Color.RED);

        getContentPane().setLayout(null);
        getContentPane().add(tgl);
        getContentPane().add(bln);
        getContentPane().add(z);
        getContentPane().add(um);
        getContentPane().add(p);
        getContentPane().add(c);
        getContentPane().add(rm);
        getContentPane().add(mon);

        getContentPane().add(tg);
        getContentPane().add(bl);
        getContentPane().add(zo);
        getContentPane().add(u);
        getContentPane().add(pek);
        getContentPane().add(cin);
        getContentPane().add(tb);

        getContentPane().add(ramal);
        getContentPane().add(hapus);
        getContentPane().add(ex);

        //pengaturan label
        tgl.setBounds(10, 10, 100, 25);
        bln.setBounds(10, 40, 100, 25);
        rm.setBounds(10, 100, 100, 25);
        z.setBounds(10, 122, 100, 25);
        um.setBounds(10, 152, 100, 25);
        p.setBounds(10, 182, 100, 25);
        c.setBounds(10, 212, 100, 25);
        mon.setBounds(165, 40, 100, 25);

        //pengaturan teks fild
        tg.setBounds(100, 10, 50, 25);
        bl.setBounds(100, 40, 50, 25);
        zo.setBounds(100, 122, 145, 25);
        u.setBounds(100, 152, 225, 25);
        pek.setBounds(100, 182, 225, 25);
        cin.setBounds(100, 212, 225, 25);
        tb.setBounds(210, 40, 110, 25);

        //pengaturan button
        ramal.setBounds(100, 75, 70, 25);
        hapus.setBounds(175, 75, 70, 25);
        ex.setBounds(250, 75, 70, 25);

        setVisible(true);
        //proses
        ramal.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int t=Integer.parseInt(tg.getText());
                int b=Integer.parseInt(bl.getText());
                if (b==1)
                {
                  tb.setText("JANUARI");
                  if (t<=18)
                  {
                    zo.setText("CAPRICORN");
                    u.setText("manfaatkan IT yang tersedia");
                    pek.setText("pas-pasan");
                    cin.setText("lagi mesra-mesranya");
                  }
                  else if (t<=31)
                  {
                    zo.setText("AQUARIUS");
                    u.setText("jangan bertindak yang tak lazim");
                    pek.setText("atur keungan kamu");
                    cin.setText("ada yang naksir kamu");
                  }                  else
                  {
                      JOptionPane.showMessageDialog(null,
                              "tanggal yang anda masukan salah");
                  }
                }

                else if (b==2)
                {
                   tb.setText("FEBRUARI");
                   if (t<=18)
                   {
                    zo.setText("AQUARIUS");
                    u.setText("jangan bertindak yang tak lazim");
                    pek.setText("atur keungan kamu");
                    cin.setText("ada yang naksir kamu");
                   }
                   else if (t<=29)
                   {
                    zo.setText("PISCES");
                    u.setText("luangkan waktumu untuk bersantai");
                    pek.setText("keungan kamu lagi menipis");
                    cin.setText("kamu lagi butuh perhatian saat ini");
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,
                              "tanggal yang anda masukan salah");
                   }
                }

                else if (b==3)
                {
                  tb.setText("MARET");
                  if (t<=20)
                  {
                    zo.setText("PISCES");
                    u.setText("luangkan waktumu untuk bersantai");
                    pek.setText("keungan kamu lagi menipis");
                    cin.setText("kamu lagi butuh perhatian saat ini");
                  }
                  else if (t<=31)
                  {
                    zo.setText("ARIES");
                    u.setText("ada hal baru di awal pekan ini");
                    pek.setText("jangan boros");
                    cin.setText("dia lagi butuh perhatianmu");
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null,
                              "tanggal yang anda masukan salah");
                  }
                }

                else if (b==4)
                {
                    tb.setText("APRIL");
                    if (t<=19)                    {
                     zo.setText("ARIES");
                     u.setText("ada hal baru di awal pekan ini");
                     pek.setText("jangan boros");
                     cin.setText("dia lagi butuh perhatianmu");
                    }
                    else if (t<=30)
                    {
                     zo.setText("TAURUS");
                     u.setText("waktunya kamu merubah sikapmu");
                     pek.setText("keuangan lancar");
                     cin.setText("lagi ada masalah");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,
                              "tanggal yang anda masukan salah");
                    }
                }

                else if (b==5)
                {
                   tb.setText("MEI");
                   if (t<=20)
                   {
                     zo.setText("TAURUS");
                     u.setText("waktunya kamu merubah sikapmu");
                     pek.setText("keungan lancar");
                     cin.setText("lagi ada masalah");
                   }
                   else if (t<=31)
                   {
                     zo.setText("GEMINI");
                     u.setText("ada persoalan dikehidupanmu");
                     pek.setText("keungan lagi boros");
                     cin.setText("mulailah PDKT dengan dia");
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,
                              "tanggal yang anda masukan salah");
                   }
                }

                else if (b==6)
                {
                  tb.setText("JUNI");
                  if (t<=21)
                  {
                     zo.setText("GEMINI");
                     u.setText("ada persoalan dikehidupanmu");
                     pek.setText("keungan lagi boros");
                     cin.setText("mulailah PDKT dengan dia");
                  }
                  else if (t<=30)
                  {
                     zo.setText("CANCER");
                     u.setText("mulailah berpikir dewasa");
                     pek.setText("lagi bokek");                     cin.setText("maafkanlah kesalahan dia");
                  }
                  else
                  {
                     JOptionPane.showMessageDialog(null,
                              "tanggal yang anda masukan salah");
                  }
                }

                else if (b==7)
                {
                   tb.setText("JULI");
                   if (t<=22)
                   {
                     zo.setText("CANCER");
                     u.setText("mulailah berpikir dewasa");
                     pek.setText("lagi bokek");
                     cin.setText("maafkanlah kesalahan dia");
                   }
                   else if (t<=31)
                   {
                     zo.setText("LEO");
                     u.setText("belajarlah dari pengelaman hidupmu");
                     pek.setText("mulailah untuk menabung");
                     cin.setText("jangan terlalu kasar dengannya");
                   }
                   else
                   {
                     JOptionPane.showMessageDialog(null,
                              "tanggal yang anda masukan salah");
                   }
                }

                else if (b==8)
                {
                   tb.setText("AGUSTUS");
                   if (t<=22)
                   {
                     zo.setText("LEO");
                     u.setText("belajarlah dari pengelaman hidupmu");
                     pek.setText("mulailah untuk menabung");
                     cin.setText("jangan terlalu kasar dengannya");
                   }
                   else if (t<=31)
                   {
                     zo.setText("VIRGO");
                     u.setText("hadapi masalahmu dengan semangat");
                     pek.setText("lagi hoki");
                     cin.setText("dia lagi butuh bantuanmu");
                   }
                   else
                   {
                      JOptionPane.showMessageDialog(null,
                              "tanggal yang anda masukan salah");
                   }
                }

                else if (b==9)
                {                  tb.setText("SEPTEMBER");
                  if (t<=22)
                  {
                    zo.setText("VIRGO");
                    u.setText("hadapi masalahmu dengan semangat");
                    pek.setText("lagi hoki");
                    cin.setText("dia lagi butuh bantuanmu");
                  }
                  else if (t<=30)
                  {
                     zo.setText("LIBRA");
                     u.setText("hargailah pendapat orang lain");
                     pek.setText("penuh perhitungan");
                     cin.setText("dia lagi cari perhatianmu");
                  }
                  else
                  {
                    JOptionPane.showMessageDialog(null,
                              "tanggal yang anda masukan salah");
                  }
                }

                else if (b==10)
                {
                  tb.setText("OKTOBER");
                  if (t<=23)
                  {
                    zo.setText("LIBRA");
                    u.setText("hargailah pendapat orang lain");
                    pek.setText("penuh perhitungan");
                    cin.setText("dia lagi cari perhatianmu");
                  }
                  else if (t<=31)
                  {
                     zo.setText("SCORPION");
                     u.setText("perhatikanlah keluargamu");
                     pek.setText("lagi banyak pengeluaran");
                     cin.setText("lagi naksir yang lebih muda");
                  }
                  else
                  {
                    JOptionPane.showMessageDialog(null,
                              "tanggal yang anda masukan salah");
                  }
                }

                else if (b==11)
                {
                   tb.setText("NOVEMBER");
                   if (t<=21)
                   {
                     zo.setText("SCORPION");
                     u.setText("perhatikanlah keluargamu");
                     pek.setText("lagi banyak pengeluaran");
                     cin.setText("lagi naksir yang lebih muda");
                   }
                   else if (t<=30)
                   {
                     zo.setText("SAGITARIUS");                     u.setText("jadilah diri kamu sendiri");
                     pek.setText("lagi seret");
                     cin.setText("dia lagi cemburu sama kamu");
                   }
                   else
                   {
                      JOptionPane.showMessageDialog(null,
                              "tanggal yang anda masukan salah");
                   }
                }

                else if (b==12)
                {
                  tb.setText("DESEMBER");
                  if (t<=21)
                  {
                    zo.setText("SAGITARIUS");
                    u.setText("jadilah diri kamu sendiri");
                    pek.setText("lagi seret");
                    cin.setText("dia lagi cemburu sama kamu");
                  }
                  else if (t<=31)
                  {
                    zo.setText("CAPRICORN");
                    u.setText("manfaatkan IT yang tersedia");
                    pek.setText("pas-pasan");
                    cin.setText("lagi mesra-mesranya");
                  }
                  else

                  {
                     JOptionPane.showMessageDialog(null,
                              "tanggal yang anda masukan salah");
                  }
                }
                else
                {
                   JOptionPane.showMessageDialog(null,
                              "bulan yang anda masukan salah");
                }
            }
        });

        hapus.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
              tg.setText("");
              bl.setText("");
              zo.setText("");
              u.setText("");
              pek.setText("");
              cin.setText("");
              tb.setText("");
            }
        });

        ex.addActionListener(new ActionListener()
        {            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args)
    {
        mistik a=new mistik();
        a.komponen();
    }
}