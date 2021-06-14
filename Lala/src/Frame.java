import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Frame {
	//Instance
	private JFrame frame;
	private JPanel panel;
	private JTextField np;
	private JTextField tp;
	private JTextField jb;
	private JPanel panel_1;
	private JTable tabel;
	private DefaultTableModel kotak;
	int harga;
	int hargax;
	int hargaz;
	int jumlahbarang;
	
	
	ArrayList<Skincare> skincares = new ArrayList<Skincare>();

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.ORANGE);
		frame.setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 1113, 549);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(22, 13, 339, 199);
		panel.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		np = new JTextField();
		np.setBounds(130, 55, 185, 29);
		panel.add(np);
		np.setColumns(10);
		
		tp = new JTextField();
		tp.setBounds(130, 88, 185, 29);
		panel.add(tp);
		tp.setColumns(10);
		
		jb = new JTextField();
		jb.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent y) {
				char x = y.getKeyChar();
				String key = String.valueOf(x);
				if(!(key.matches("(.*)[0-9](.*)")) && (x != '\b')) {
					y.consume();
				}
			}
		});
		jb.setBounds(130, 130, 185, 29);
		panel.add(jb);
		jb.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pembelian");
		lblNewLabel.setBounds(126, 13, 99, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nama Pembeli");
		lblNewLabel_1.setBounds(12, 52, 83, 16);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("Tanggal Pembelian");
		lblNewLabel_6.setBounds(12, 94, 116, 16);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Jumlah Barang");
		lblNewLabel_7.setBounds(12, 136, 106, 16);
		panel.add(lblNewLabel_7);
		
		panel_1 = new JPanel();
		panel_1.setBounds(22, 214, 339, 213);
		panel_1.setBackground(Color.ORANGE);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox merk = new JComboBox();
		merk.setModel(new DefaultComboBoxModel(new String[] {"--Pilih Merk--", "Jafra", "Some By Mi", "Scarlet", "Axis Y"}));
		merk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(merk.getSelectedItem() == "--Pilih Merk--") {
					JOptionPane.showMessageDialog(null, "Pilih Merk yang akan dibeli!!!");
				}
				if(merk.getSelectedItem() == "Jafra") {
					hargax=3;
				}
				if(merk.getSelectedItem() == "Some By Mi") {
					hargax=4;
				}
				if(merk.getSelectedItem() == "Scarlet") {
					hargax=2;
				}
				if(merk.getSelectedItem() == "Axis Y") {
					hargax=5;
				}
			}
		});
		merk.setMaximumRowCount(4);
		merk.setBounds(126, 75, 164, 22);
		panel_1.add(merk);
		JComboBox pr = new JComboBox();
		pr.setModel(new DefaultComboBoxModel(new String[] {"--Pilih Produk--", "Serum", "Toner", "Mosturaizer", "Cleaning Water"}));
		pr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(pr.getSelectedItem() == "--Pilih Produk--") {
					JOptionPane.showMessageDialog(null, "Pilih produk yang akan dibeli!!!");
				}
				if(pr.getSelectedItem() == "Serum") {
					hargaz=20000;
				}
				if(pr.getSelectedItem() == "Toner") {
					hargaz=35000;
				}
				if(pr.getSelectedItem() == "Mosturaizer") {
					hargaz=18000;
				}
				if(pr.getSelectedItem() == "Cleaning Water") {
					hargaz=21000;
				}
			}
		});
		pr.setMaximumRowCount(4);
		pr.setBounds(126, 110, 164, 22);
		panel_1.add(pr);
		
		JComboBox bonus = new JComboBox();
		bonus.setBounds(126, 145, 164, 22);
		bonus.setModel(new DefaultComboBoxModel(new String[] {"--Pilih Bonus--", "Sunscreen", "Mogwart Mask", "Spray Mist"}));
		bonus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_1.add(bonus);
		
		JLabel lblNewLabel_2 = new JLabel("Paket Skincare");
		lblNewLabel_2.setBounds(94, 0, 159, 36);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Merk");
		lblNewLabel_3.setBounds(33, 76, 81, 19);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Bonus");
		lblNewLabel_4.setBounds(33, 148, 81, 16);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Produk");
		lblNewLabel_5.setBounds(33, 112, 69, 16);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(lblNewLabel_5);
		
		JScrollPane box = new JScrollPane();
		box.setBounds(377, 13, 706, 318);
		frame.getContentPane().add(box);
		
		tabel = new JTable();
		tabel.setBackground(Color.GRAY);
		tabel.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nama Pembeli", "Tanggal Pembelian", "Jumlah Barang", "Merk", "Produk", "Bonus", "Harga"
			}
		));
		tabel.getColumnModel().getColumn(0).setPreferredWidth(97);
		tabel.getColumnModel().getColumn(1).setPreferredWidth(123);
		tabel.getColumnModel().getColumn(2).setPreferredWidth(97);
		tabel.getColumnModel().getColumn(3).setPreferredWidth(91);
		tabel.getColumnModel().getColumn(4).setPreferredWidth(101);
		tabel.getColumnModel().getColumn(5).setPreferredWidth(102);
		tabel.getColumnModel().getColumn(6).setPreferredWidth(108);
		box.setViewportView(tabel);
		
		JButton btnbeli = new JButton("Buat Pembelian");
		btnbeli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String namapembeli = np.getText();
				String tanggal = tp.getText();
				String jumlah = jb.getText();
				String Merk = merk.getSelectedItem().toString();
				String produk = pr.getSelectedItem().toString();
				String Bonus = bonus.getSelectedItem().toString();
				harga = (hargax*hargaz*(Integer.valueOf(jb.getText())));
				String ha = "Rp" + String.valueOf(harga);
				skincares.add(new Skincare(namapembeli, tanggal, jumlah, Merk, produk, Bonus, ha));
				kotak = (DefaultTableModel) tabel.getModel();
				Object[] beli = new Object[7];
				beli[0]= namapembeli;
				beli[1]= tanggal;
				beli[2]= jumlah;
				beli[3]= Merk;
				beli[4]= produk;
				beli[5]= Bonus;
				beli[6]= ha;
				kotak.addRow(beli);
			}
		});
		btnbeli.setBounds(22, 440, 133, 35);
		frame.getContentPane().add(btnbeli);
		
		JButton btnjual = new JButton("Hapus Pembelian");
		btnjual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int confirm = JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus anda pada baris ini?", "Hapus Data", JOptionPane.YES_NO_OPTION);
				int row = tabel.getSelectedRow(); 
				if (row >= 0) {					
					if(confirm == 0) {
						kotak.removeRow(row);
						JOptionPane.showMessageDialog(null, "Data Sudah Terhapus");
					}				
			}
		 }
		});
		btnjual.setBounds(228, 440, 133, 35);
		frame.getContentPane().add(btnjual);
	}
}
