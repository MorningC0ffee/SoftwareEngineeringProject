import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class DisplayVoter extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldAddress;
	private JTextField textFieldID;
	private JTextField textFieldState;
	private JTextField textFieldZipCode;

	/**
	 * Launch the application.
	 */
	public static void main(Voter voter) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayVoter frame = new DisplayVoter(voter);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DisplayVoter(Voter voter) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 461, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		textFieldName = new JTextField();
		textFieldName.setEditable(false);
		contentPane.add(textFieldName, "4, 2, fill, default");
		textFieldName.setColumns(10);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setEditable(false);
		contentPane.add(textFieldAddress, "4, 4, fill, default");
		textFieldAddress.setColumns(10);
		
		textFieldID = new JTextField();
		textFieldID.setEditable(false);
		contentPane.add(textFieldID, "4, 6, fill, default");
		textFieldID.setColumns(10);
		
		textFieldState = new JTextField();
		textFieldState.setEditable(false);
		contentPane.add(textFieldState, "4, 8, fill, default");
		textFieldState.setColumns(10);
		
		textFieldZipCode = new JTextField();
		textFieldZipCode.setEditable(false);
		contentPane.add(textFieldZipCode, "4, 10, fill, default");
		textFieldZipCode.setColumns(10);
		
		textFieldName.setText(voter.getName());
		textFieldAddress.setText(voter.getAddress());
		textFieldID.setText(String.valueOf(voter.getVoterID()));
		textFieldState.setText(voter.getState());
		textFieldZipCode.setText(String.valueOf(voter.getZipcode()));
	}

}
