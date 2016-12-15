//Kyle Tuohy
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends Applet implements ActionListener
{

	String PlayerOneTag;
	String PlayerTwoTag;

	boolean WinnerX = false;
	boolean WinnerO = false;
	boolean Start = false;

	int PlayerOneTurn = 1;

	boolean X1d = false;
	boolean X2d = false;
	boolean X3d = false;
	boolean X4d = false;
	boolean X5d = false;
	boolean X6d = false;
	boolean X7d = false;
	boolean X8d = false;
	boolean X9d = false;

	boolean O1d = false;
	boolean O2d = false;
	boolean O3d = false;
	boolean O4d = false;
	boolean O5d = false;
	boolean O6d = false;
	boolean O7d = false;
	boolean O8d = false;
	boolean O9d = false;


	Image Background;

	Image X1 = new ImageIcon("X.png").getImage();
	Image X2 = new ImageIcon("X.png").getImage();
	Image X3 = new ImageIcon("X.png").getImage();
	Image X21 = new ImageIcon("X.png").getImage();
	Image X22 = new ImageIcon("X.png").getImage();
	Image X23 = new ImageIcon("X.png").getImage();
	Image X31 = new ImageIcon("X.png").getImage();
	Image X32 = new ImageIcon("X.png").getImage();
	Image X33 = new ImageIcon("X.png").getImage();

	Image O1 = new ImageIcon("O.png").getImage();
	Image O2 = new ImageIcon("O.png").getImage();
	Image O3 = new ImageIcon("O.png").getImage();
	Image O21 = new ImageIcon("O.png").getImage();
	Image O22 = new ImageIcon("O.png").getImage();
	Image O23 = new ImageIcon("O.png").getImage();
	Image O31 = new ImageIcon("O.png").getImage();
	Image O32 = new ImageIcon("O.png").getImage();
	Image O33 = new ImageIcon("O.png").getImage();

	Font NameFont = new Font("BerlinSansFBDemi", Font.PLAIN,36);
	Font ActivePlayer = new Font("BerlinSansFBDemi", Font.BOLD,26);
	Font InActivePlayer = new Font("BerlinSansFBDemi", Font.PLAIN,26);

	TextField PlayerOneField = new TextField(5);
	TextField PlayerTwoField = new TextField(5);

	Label PlayerOneName = new Label("Player One");
	Label PlayerTwoName = new Label("Player Two");
	Label TicTacToeLabel = new Label("Tic Tac Toe");

	Label NameLabel = new Label("Tic Tac Toe");
	Label PlayerOneLabel = new Label("Player1");
	Label PlayerTwoLabel = new Label("Player2");
	Label WinnerOne = new Label("Winner !!!!");
	Label WinnerTwo = new Label("Winner !!!!");

	Button StartButton = new Button("Start");

	Button ChoiceButton1 = new Button("");
	Button ChoiceButton2 = new Button("");
	Button ChoiceButton3 = new Button("");
	Button ChoiceButton4 = new Button("");
	Button ChoiceButton5 = new Button("");
	Button ChoiceButton6 = new Button("");
	Button ChoiceButton7 = new Button("");
	Button ChoiceButton8 = new Button("");
	Button ChoiceButton9 = new Button("");

	Button PlayAgain = new Button("Play Again ?");

	public void init()
	{
		setSize(400,300);
		Background = getImage(getDocumentBase(),"TicTacToeBoard.jpg");
		setBackground(Color.orange);

		add(PlayerOneName);
		add(PlayerTwoName);
		add(PlayerOneField);
		add(PlayerTwoField);
		add(TicTacToeLabel);

		NameLabel.setFont(NameFont);
		TicTacToeLabel.setFont(NameFont);
		PlayerOneLabel.setFont(ActivePlayer);
		PlayerTwoLabel.setFont(InActivePlayer);
		WinnerOne.setFont(InActivePlayer);
		WinnerTwo.setFont(InActivePlayer);
		PlayerOneName.setFont(ActivePlayer);
		PlayerTwoName.setFont(ActivePlayer);

		NameLabel.setVisible(false);
		PlayerOneLabel.setVisible(false);
		PlayerTwoLabel.setVisible(false);
		ChoiceButton1.setVisible(false);
		ChoiceButton2.setVisible(false);
		ChoiceButton3.setVisible(false);
		ChoiceButton4.setVisible(false);
		ChoiceButton5.setVisible(false);
		ChoiceButton6.setVisible(false);
		ChoiceButton7.setVisible(false);
		ChoiceButton8.setVisible(false);
		ChoiceButton9.setVisible(false);
		PlayAgain.setVisible(false);


		add(NameLabel);
		add(PlayerOneLabel);
		add(PlayerTwoLabel);
		add(WinnerOne);
		add(WinnerTwo);

		WinnerOne.setVisible(false);
		WinnerTwo.setVisible(false);

		add(StartButton);
		add(PlayAgain);

		add(ChoiceButton1);
		add(ChoiceButton2);
		add(ChoiceButton3);
		add(ChoiceButton4);
		add(ChoiceButton5);
		add(ChoiceButton6);
		add(ChoiceButton7);
		add(ChoiceButton8);
		add(ChoiceButton9);

		StartButton.addActionListener(this);
		PlayAgain.addActionListener(this);

		ChoiceButton1.addActionListener(this);
		ChoiceButton2.addActionListener(this);
		ChoiceButton3.addActionListener(this);
		ChoiceButton4.addActionListener(this);
		ChoiceButton5.addActionListener(this);
		ChoiceButton6.addActionListener(this);
		ChoiceButton7.addActionListener(this);
		ChoiceButton8.addActionListener(this);
		ChoiceButton9.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == StartButton)
		{
			PlayerOneTag = PlayerOneField.getText();
			PlayerTwoTag = PlayerTwoField.getText();
			StartButton.setVisible(false);
			PlayerOneName.setVisible(false);
			PlayerTwoName.setVisible(false);
			PlayerOneField.setVisible(false);
			PlayerTwoField.setVisible(false);
			TicTacToeLabel.setVisible(false);
			Start = true;
			PlayerOneLabel.setText(PlayerOneTag);
			PlayerTwoLabel.setText(PlayerTwoTag);
			ChoiceButton1.setVisible(true);
			ChoiceButton2.setVisible(true);
			ChoiceButton3.setVisible(true);
			ChoiceButton4.setVisible(true);
			ChoiceButton5.setVisible(true);
			ChoiceButton6.setVisible(true);
			ChoiceButton7.setVisible(true);
			ChoiceButton8.setVisible(true);
			ChoiceButton9.setVisible(true);
		}
		if(e.getSource() == ChoiceButton1)
		{
			ChoiceButton1.setVisible(false);
			ChoiceButton1.setEnabled(false);
			if(PlayerOneTurn == 1)
			{
				X1d = true;
				PlayerOneTurn = 0;
				PlayerTwoLabel.setFont(ActivePlayer);
				PlayerOneLabel.setFont(InActivePlayer);
			}
			else if(PlayerOneTurn != 1)
			{
			    O1d = true;
				PlayerOneTurn = 1;
				PlayerOneLabel.setFont(ActivePlayer);
				PlayerTwoLabel.setFont(InActivePlayer);
			}
			//X Winner Test

			if(X1d == true && X2d == true && X3d == true)
			{
				WinnerX = true;
			}
			if(X4d == true && X5d == true && X6d == true)
			{
				WinnerX = true;
			}
			if(X7d == true && X8d == true && X9d == true)
			{
				WinnerX = true;
			}
			/////////////////////////////////////////////
			if(X1d == true && X4d == true && X7d == true)
			{
				WinnerX = true;
			}
			if(X2d == true && X5d == true && X8d == true)
			{
				WinnerX = true;
			}
			if(X3d == true && X6d == true && X9d == true)
			{
				WinnerX = true;
			}
			////////////////////////////////////////////
			if(X1d == true && X5d == true && X9d == true)
			{
				WinnerX = true;
			}
			if(X3d == true && X5d == true && X7d == true)
			{
				WinnerX = true;
			}
			//
			///////////////////////////////////////////
			//O Winner Test
			if(O1d == true && O2d == true && O3d == true)
			{
				WinnerO = true;
			}
			if(O4d == true && O5d == true && O6d == true)
			{
				WinnerO = true;
			}
			if(O7d == true && O8d == true && O9d == true)
			{
				WinnerO = true;
			}
			/////////////////////////////////////////////
			if(O1d == true && O4d == true && O7d == true)
			{
				WinnerO = true;
			}
			if(O2d == true && O5d == true && O8d == true)
			{
				WinnerO = true;
			}
			if(O3d == true && O6d == true && O9d == true)
			{
				WinnerO = true;
			}
			////////////////////////////////////////////
			if(O1d == true && O5d == true && O9d == true)
			{
				WinnerO = true;
			}
			if(O3d == true && O5d == true && O7d == true)
			{
				WinnerO = true;
			}
			/////////////////////////////////////////////
			// Winner
			if(WinnerX == true)
			{
				PlayerOneLabel.setFont(InActivePlayer);
				PlayerTwoLabel.setFont(InActivePlayer);
				WinnerOne.setVisible(true);

				ChoiceButton1.setEnabled(false);
				ChoiceButton2.setEnabled(false);
				ChoiceButton3.setEnabled(false);
				ChoiceButton4.setEnabled(false);
				ChoiceButton5.setEnabled(false);
				ChoiceButton6.setEnabled(false);
				ChoiceButton7.setEnabled(false);
				ChoiceButton8.setEnabled(false);
				ChoiceButton9.setEnabled(false);
			}
			if(WinnerO == true)
			{
				PlayerOneLabel.setFont(InActivePlayer);
				PlayerTwoLabel.setFont(InActivePlayer);
				WinnerTwo.setVisible(true);

				ChoiceButton1.setEnabled(false);
				ChoiceButton2.setEnabled(false);
				ChoiceButton3.setEnabled(false);
				ChoiceButton4.setEnabled(false);
				ChoiceButton5.setEnabled(false);
				ChoiceButton6.setEnabled(false);
				ChoiceButton7.setEnabled(false);
				ChoiceButton8.setEnabled(false);
				ChoiceButton9.setEnabled(false);
			}
		}
		if(e.getSource() == ChoiceButton2)
		{
			ChoiceButton2.setVisible(false);
			ChoiceButton2.setEnabled(false);


			if(PlayerOneTurn == 1)
			{
				X2d = true;
				PlayerOneTurn = 0;
				PlayerTwoLabel.setFont(ActivePlayer);
				PlayerOneLabel.setFont(InActivePlayer);
			}
			else if(PlayerOneTurn != 1)
			{
				O2d = true;
				PlayerOneTurn = 1;
				PlayerOneLabel.setFont(ActivePlayer);
				PlayerTwoLabel.setFont(InActivePlayer);
			}
					//X Winner Test

					if(X1d == true && X2d == true && X3d == true)
					{
						WinnerX = true;
					}
					if(X4d == true && X5d == true && X6d == true)
					{
						WinnerX = true;
					}
					if(X7d == true && X8d == true && X9d == true)
					{
						WinnerX = true;
					}
					/////////////////////////////////////////////
					if(X1d == true && X4d == true && X7d == true)
					{
						WinnerX = true;
					}
					if(X2d == true && X5d == true && X8d == true)
					{
						WinnerX = true;
					}
					if(X3d == true && X6d == true && X9d == true)
					{
						WinnerX = true;
					}
					////////////////////////////////////////////
					if(X1d == true && X5d == true && X9d == true)
					{
						WinnerX = true;
					}
					if(X3d == true && X5d == true && X7d == true)
					{
						WinnerX = true;
					}
					//
					///////////////////////////////////////////
					//O Winner Test
					if(O1d == true && O2d == true && O3d == true)
					{
						WinnerO = true;
					}
					if(O4d == true && O5d == true && O6d == true)
					{
						WinnerO = true;
					}
					if(O7d == true && O8d == true && O9d == true)
					{
						WinnerO = true;
					}
					/////////////////////////////////////////////
					if(O1d == true && O4d == true && O7d == true)
					{
						WinnerO = true;
					}
					if(O2d == true && O5d == true && O8d == true)
					{
						WinnerO = true;
					}
					if(O3d == true && O6d == true && O9d == true)
					{
						WinnerO = true;
					}
					////////////////////////////////////////////
					if(O1d == true && O5d == true && O9d == true)
					{
						WinnerO = true;
					}
					if(O3d == true && O5d == true && O7d == true)
					{
						WinnerO = true;
					}
					/////////////////////////////////////////////
					// Winner
					if(WinnerX == true)
					{
						PlayerOneLabel.setFont(InActivePlayer);
						PlayerTwoLabel.setFont(InActivePlayer);
						WinnerOne.setVisible(true);

						ChoiceButton1.setEnabled(false);
						ChoiceButton2.setEnabled(false);
						ChoiceButton3.setEnabled(false);
						ChoiceButton4.setEnabled(false);
						ChoiceButton5.setEnabled(false);
						ChoiceButton6.setEnabled(false);
						ChoiceButton7.setEnabled(false);
						ChoiceButton8.setEnabled(false);
						ChoiceButton9.setEnabled(false);
					}
					if(WinnerO == true)
					{
						PlayerOneLabel.setFont(InActivePlayer);
						PlayerTwoLabel.setFont(InActivePlayer);
						WinnerTwo.setVisible(true);

						ChoiceButton1.setEnabled(false);
						ChoiceButton2.setEnabled(false);
						ChoiceButton3.setEnabled(false);
						ChoiceButton4.setEnabled(false);
						ChoiceButton5.setEnabled(false);
						ChoiceButton6.setEnabled(false);
						ChoiceButton7.setEnabled(false);
						ChoiceButton8.setEnabled(false);
						ChoiceButton9.setEnabled(false);
					}
		}
		if(e.getSource() == ChoiceButton3)
		{
			ChoiceButton3.setVisible(false);
			ChoiceButton3.setEnabled(false);
					if(PlayerOneTurn == 1)
					{
						X3d = true;
						PlayerOneTurn = 0;
						PlayerTwoLabel.setFont(ActivePlayer);
						PlayerOneLabel.setFont(InActivePlayer);
					}

					else if(PlayerOneTurn != 1)
					{
						O3d = true;
						PlayerOneTurn = 1;
						PlayerOneLabel.setFont(ActivePlayer);
						PlayerTwoLabel.setFont(InActivePlayer);
					}

					//X Winner Test

					if(X1d == true && X2d == true && X3d == true)
					{
						WinnerX = true;
					}
					if(X4d == true && X5d == true && X6d == true)
					{
						WinnerX = true;
					}
					if(X7d == true && X8d == true && X9d == true)
					{
						WinnerX = true;
					}
					/////////////////////////////////////////////
					if(X1d == true && X4d == true && X7d == true)
					{
						WinnerX = true;
					}
					if(X2d == true && X5d == true && X8d == true)
					{
						WinnerX = true;
					}
					if(X3d == true && X6d == true && X9d == true)
					{
						WinnerX = true;
					}
					////////////////////////////////////////////
					if(X1d == true && X5d == true && X9d == true)
					{
						WinnerX = true;
					}
					if(X3d == true && X5d == true && X7d == true)
					{
						WinnerX = true;
					}
					//
					///////////////////////////////////////////
					//O Winner Test
					if(O1d == true && O2d == true && O3d == true)
					{
						WinnerO = true;
					}
					if(O4d == true && O5d == true && O6d == true)
					{
						WinnerO = true;
					}
					if(O7d == true && O8d == true && O9d == true)
					{
						WinnerO = true;
					}
					/////////////////////////////////////////////
					if(O1d == true && O4d == true && O7d == true)
					{
						WinnerO = true;
					}
					if(O2d == true && O5d == true && O8d == true)
					{
						WinnerO = true;
					}
					if(O3d == true && O6d == true && O9d == true)
					{
						WinnerO = true;
					}
					////////////////////////////////////////////
					if(O1d == true && O5d == true && O9d == true)
					{
						WinnerO = true;
					}
					if(O3d == true && O5d == true && O7d == true)
					{
						WinnerO = true;
					}
					/////////////////////////////////////////////
					// Winner
					if(WinnerX == true)
					{
						PlayerOneLabel.setFont(InActivePlayer);
						PlayerTwoLabel.setFont(InActivePlayer);
						WinnerOne.setVisible(true);

						ChoiceButton1.setEnabled(false);
						ChoiceButton2.setEnabled(false);
						ChoiceButton3.setEnabled(false);
						ChoiceButton4.setEnabled(false);
						ChoiceButton5.setEnabled(false);
						ChoiceButton6.setEnabled(false);
						ChoiceButton7.setEnabled(false);
						ChoiceButton8.setEnabled(false);
						ChoiceButton9.setEnabled(false);
					}
					if(WinnerO == true)
					{
						PlayerOneLabel.setFont(InActivePlayer);
						PlayerTwoLabel.setFont(InActivePlayer);
						WinnerTwo.setVisible(true);
						ChoiceButton1.setEnabled(false);
						ChoiceButton2.setEnabled(false);
						ChoiceButton3.setEnabled(false);
						ChoiceButton4.setEnabled(false);
						ChoiceButton5.setEnabled(false);
						ChoiceButton6.setEnabled(false);
						ChoiceButton7.setEnabled(false);
						ChoiceButton8.setEnabled(false);
						ChoiceButton9.setEnabled(false);
					}
		}
		if(e.getSource() == ChoiceButton4)
		{

			ChoiceButton4.setVisible(false);
			ChoiceButton4.setEnabled(false);
			if(PlayerOneTurn == 1)
			{
				X4d = true;
				PlayerOneTurn = 0;
				PlayerTwoLabel.setFont(ActivePlayer);
				PlayerOneLabel.setFont(InActivePlayer);
			}


			else if(PlayerOneTurn != 1)
			{
				O4d = true;
				PlayerOneTurn = 1;
				PlayerOneLabel.setFont(ActivePlayer);
				PlayerTwoLabel.setFont(InActivePlayer);
			}
					//X Winner Test

					if(X1d == true && X2d == true && X3d == true)
					{
						WinnerX = true;
					}
					if(X4d == true && X5d == true && X6d == true)
					{
						WinnerX = true;
					}
					if(X7d == true && X8d == true && X9d == true)
					{
						WinnerX = true;
					}
					/////////////////////////////////////////////
					if(X1d == true && X4d == true && X7d == true)
					{
						WinnerX = true;
					}
					if(X2d == true && X5d == true && X8d == true)
					{
						WinnerX = true;
					}
					if(X3d == true && X6d == true && X9d == true)
					{
						WinnerX = true;
					}
					////////////////////////////////////////////
					if(X1d == true && X5d == true && X9d == true)
					{
						WinnerX = true;
					}
					if(X3d == true && X5d == true && X7d == true)
					{
						WinnerX = true;
					}
					//
					///////////////////////////////////////////
					//O Winner Test
					if(O1d == true && O2d == true && O3d == true)
					{
						WinnerO = true;
					}
					if(O4d == true && O5d == true && O6d == true)
					{
						WinnerO = true;
					}
					if(O7d == true && O8d == true && O9d == true)
					{
						WinnerO = true;
					}
					/////////////////////////////////////////////
					if(O1d == true && O4d == true && O7d == true)
					{
						WinnerO = true;
					}
					if(O2d == true && O5d == true && O8d == true)
					{
						WinnerO = true;
					}
					if(O3d == true && O6d == true && O9d == true)
					{
						WinnerO = true;
					}
					////////////////////////////////////////////
					if(O1d == true && O5d == true && O9d == true)
					{
						WinnerO = true;
					}
					if(O3d == true && O5d == true && O7d == true)
					{
						WinnerO = true;
					}
					/////////////////////////////////////////////
					// Winner
					if(WinnerX == true)
					{
						PlayerOneLabel.setFont(InActivePlayer);
						PlayerTwoLabel.setFont(InActivePlayer);
						WinnerOne.setVisible(true);

						ChoiceButton1.setEnabled(false);
						ChoiceButton2.setEnabled(false);
						ChoiceButton3.setEnabled(false);
						ChoiceButton4.setEnabled(false);
						ChoiceButton5.setEnabled(false);
						ChoiceButton6.setEnabled(false);
						ChoiceButton7.setEnabled(false);
						ChoiceButton8.setEnabled(false);
						ChoiceButton9.setEnabled(false);
					}
					if(WinnerO == true)
					{
						PlayerOneLabel.setFont(InActivePlayer);
						PlayerTwoLabel.setFont(InActivePlayer);
						WinnerTwo.setVisible(true);

						ChoiceButton1.setEnabled(false);
						ChoiceButton2.setEnabled(false);
						ChoiceButton3.setEnabled(false);
						ChoiceButton4.setEnabled(false);
						ChoiceButton5.setEnabled(false);
						ChoiceButton6.setEnabled(false);
						ChoiceButton7.setEnabled(false);
						ChoiceButton8.setEnabled(false);
						ChoiceButton9.setEnabled(false);
					}
		}
		if(e.getSource() == ChoiceButton5)
				{
					ChoiceButton5.setVisible(false);
					ChoiceButton5.setEnabled(false);
					if(PlayerOneTurn == 1)
					{
						X5d = true;
						PlayerOneTurn = 0;
						PlayerTwoLabel.setFont(ActivePlayer);
						PlayerOneLabel.setFont(InActivePlayer);
					}


					else if(PlayerOneTurn != 1)
					{
						O5d = true;
						PlayerOneTurn = 1;
						PlayerOneLabel.setFont(ActivePlayer);
						PlayerTwoLabel.setFont(InActivePlayer);
					}
							//X Winner Test

							if(X1d == true && X2d == true && X3d == true)
							{
								WinnerX = true;
							}
							if(X4d == true && X5d == true && X6d == true)
							{
								WinnerX = true;
							}
							if(X7d == true && X8d == true && X9d == true)
							{
								WinnerX = true;
							}
							/////////////////////////////////////////////
							if(X1d == true && X4d == true && X7d == true)
							{
								WinnerX = true;
							}
							if(X2d == true && X5d == true && X8d == true)
							{
								WinnerX = true;
							}
							if(X3d == true && X6d == true && X9d == true)
							{
								WinnerX = true;
							}
							////////////////////////////////////////////
							if(X1d == true && X5d == true && X9d == true)
							{
								WinnerX = true;
							}
							if(X3d == true && X5d == true && X7d == true)
							{
								WinnerX = true;
							}
							//
							///////////////////////////////////////////
							//O Winner Test
							if(O1d == true && O2d == true && O3d == true)
							{
								WinnerO = true;
							}
							if(O4d == true && O5d == true && O6d == true)
							{
								WinnerO = true;
							}
							if(O7d == true && O8d == true && O9d == true)
							{
								WinnerO = true;
							}
							/////////////////////////////////////////////
							if(O1d == true && O4d == true && O7d == true)
							{
								WinnerO = true;
							}
							if(O2d == true && O5d == true && O8d == true)
							{
								WinnerO = true;
							}
							if(O3d == true && O6d == true && O9d == true)
							{
								WinnerO = true;
							}
							////////////////////////////////////////////
							if(O1d == true && O5d == true && O9d == true)
							{
								WinnerO = true;
							}
							if(O3d == true && O5d == true && O7d == true)
							{
								WinnerO = true;
							}
							/////////////////////////////////////////////
							// Winner
							if(WinnerX == true)
							{
								PlayerOneLabel.setFont(InActivePlayer);
								PlayerTwoLabel.setFont(InActivePlayer);
								WinnerOne.setVisible(true);

								ChoiceButton1.setEnabled(false);
								ChoiceButton2.setEnabled(false);
								ChoiceButton3.setEnabled(false);
								ChoiceButton4.setEnabled(false);
								ChoiceButton5.setEnabled(false);
								ChoiceButton6.setEnabled(false);
								ChoiceButton7.setEnabled(false);
								ChoiceButton8.setEnabled(false);
								ChoiceButton9.setEnabled(false);
							}
							if(WinnerO == true)
							{
								PlayerOneLabel.setFont(InActivePlayer);
								PlayerTwoLabel.setFont(InActivePlayer);
								WinnerTwo.setVisible(true);

								ChoiceButton1.setEnabled(false);
								ChoiceButton2.setEnabled(false);
								ChoiceButton3.setEnabled(false);
								ChoiceButton4.setEnabled(false);
								ChoiceButton5.setEnabled(false);
								ChoiceButton6.setEnabled(false);
								ChoiceButton7.setEnabled(false);
								ChoiceButton8.setEnabled(false);
								ChoiceButton9.setEnabled(false);
							}
		}
		if(e.getSource() == ChoiceButton6)
				{
					ChoiceButton6.setVisible(false);
					ChoiceButton6.setEnabled(false);
					if(PlayerOneTurn == 1)
					{
						X6d = true;
						PlayerOneTurn = 0;
						PlayerTwoLabel.setFont(ActivePlayer);
						PlayerOneLabel.setFont(InActivePlayer);
					}


					else if(PlayerOneTurn != 1)
					{
						O6d = true;
						PlayerOneTurn = 1;
						PlayerOneLabel.setFont(ActivePlayer);
						PlayerTwoLabel.setFont(InActivePlayer);
					}
							//X Winner Test

							if(X1d == true && X2d == true && X3d == true)
							{
								WinnerX = true;
							}
							if(X4d == true && X5d == true && X6d == true)
							{
								WinnerX = true;
							}
							if(X7d == true && X8d == true && X9d == true)
							{
								WinnerX = true;
							}
							/////////////////////////////////////////////
							if(X1d == true && X4d == true && X7d == true)
							{
								WinnerX = true;
							}
							if(X2d == true && X5d == true && X8d == true)
							{
								WinnerX = true;
							}
							if(X3d == true && X6d == true && X9d == true)
							{
								WinnerX = true;
							}
							////////////////////////////////////////////
							if(X1d == true && X5d == true && X9d == true)
							{
								WinnerX = true;
							}
							if(X3d == true && X5d == true && X7d == true)
							{
								WinnerX = true;
							}
							//
							///////////////////////////////////////////
							//O Winner Test
							if(O1d == true && O2d == true && O3d == true)
							{
								WinnerO = true;
							}
							if(O4d == true && O5d == true && O6d == true)
							{
								WinnerO = true;
							}
							if(O7d == true && O8d == true && O9d == true)
							{
								WinnerO = true;
							}
							/////////////////////////////////////////////
							if(O1d == true && O4d == true && O7d == true)
							{
								WinnerO = true;
							}
							if(O2d == true && O5d == true && O8d == true)
							{
								WinnerO = true;
							}
							if(O3d == true && O6d == true && O9d == true)
							{
								WinnerO = true;
							}
							////////////////////////////////////////////
							if(O1d == true && O5d == true && O9d == true)
							{
								WinnerO = true;
							}
							if(O3d == true && O5d == true && O7d == true)
							{
								WinnerO = true;
							}
							/////////////////////////////////////////////
							// Winner
							if(WinnerX == true)
							{
								PlayerOneLabel.setFont(InActivePlayer);
								PlayerTwoLabel.setFont(InActivePlayer);
								WinnerOne.setVisible(true);

								ChoiceButton1.setEnabled(false);
								ChoiceButton2.setEnabled(false);
								ChoiceButton3.setEnabled(false);
								ChoiceButton4.setEnabled(false);
								ChoiceButton5.setEnabled(false);
								ChoiceButton6.setEnabled(false);
								ChoiceButton7.setEnabled(false);
								ChoiceButton8.setEnabled(false);
								ChoiceButton9.setEnabled(false);
							}
							if(WinnerO == true)
							{
								PlayerOneLabel.setFont(InActivePlayer);
								PlayerTwoLabel.setFont(InActivePlayer);
								WinnerTwo.setVisible(true);

								ChoiceButton1.setEnabled(false);
								ChoiceButton2.setEnabled(false);
								ChoiceButton3.setEnabled(false);
								ChoiceButton4.setEnabled(false);
								ChoiceButton5.setEnabled(false);
								ChoiceButton6.setEnabled(false);
								ChoiceButton7.setEnabled(false);
								ChoiceButton8.setEnabled(false);
								ChoiceButton9.setEnabled(false);
							}
		}
		if(e.getSource() == ChoiceButton7)
				{
					ChoiceButton7.setVisible(false);
					ChoiceButton7.setEnabled(false);
					if(PlayerOneTurn == 1)
					{
						X7d = true;
						PlayerOneTurn = 0;
						PlayerTwoLabel.setFont(ActivePlayer);
						PlayerOneLabel.setFont(InActivePlayer);
					}


					else if(PlayerOneTurn != 1)
					{
						O7d = true;
						PlayerOneTurn = 1;
						PlayerOneLabel.setFont(ActivePlayer);
						PlayerTwoLabel.setFont(InActivePlayer);
					}
							//X Winner Test

							if(X1d == true && X2d == true && X3d == true)
							{
								WinnerX = true;
							}
							if(X4d == true && X5d == true && X6d == true)
							{
								WinnerX = true;
							}
							if(X7d == true && X8d == true && X9d == true)
							{
								WinnerX = true;
							}
							/////////////////////////////////////////////
							if(X1d == true && X4d == true && X7d == true)
							{
								WinnerX = true;
							}
							if(X2d == true && X5d == true && X8d == true)
							{
								WinnerX = true;
							}
							if(X3d == true && X6d == true && X9d == true)
							{
								WinnerX = true;
							}
							////////////////////////////////////////////
							if(X1d == true && X5d == true && X9d == true)
							{
								WinnerX = true;
							}
							if(X3d == true && X5d == true && X7d == true)
							{
								WinnerX = true;
							}
							//
							///////////////////////////////////////////
							//O Winner Test
							if(O1d == true && O2d == true && O3d == true)
							{
								WinnerO = true;
							}
							if(O4d == true && O5d == true && O6d == true)
							{
								WinnerO = true;
							}
							if(O7d == true && O8d == true && O9d == true)
							{
								WinnerO = true;
							}
							/////////////////////////////////////////////
							if(O1d == true && O4d == true && O7d == true)
							{
								WinnerO = true;
							}
							if(O2d == true && O5d == true && O8d == true)
							{
								WinnerO = true;
							}
							if(O3d == true && O6d == true && O9d == true)
							{
								WinnerO = true;
							}
							////////////////////////////////////////////
							if(O1d == true && O5d == true && O9d == true)
							{
								WinnerO = true;
							}
							if(O3d == true && O5d == true && O7d == true)
							{
								WinnerO = true;
							}
							/////////////////////////////////////////////
							// Winner
							if(WinnerX == true)
							{
								PlayerOneLabel.setFont(InActivePlayer);
								PlayerTwoLabel.setFont(InActivePlayer);
								WinnerOne.setVisible(true);

								ChoiceButton1.setEnabled(false);
								ChoiceButton2.setEnabled(false);
								ChoiceButton3.setEnabled(false);
								ChoiceButton4.setEnabled(false);
								ChoiceButton5.setEnabled(false);
								ChoiceButton6.setEnabled(false);
								ChoiceButton7.setEnabled(false);
								ChoiceButton8.setEnabled(false);
								ChoiceButton9.setEnabled(false);
							}
							if(WinnerO == true)
							{
								PlayerOneLabel.setFont(InActivePlayer);
								PlayerTwoLabel.setFont(InActivePlayer);
								WinnerTwo.setVisible(true);

								ChoiceButton1.setEnabled(false);
								ChoiceButton2.setEnabled(false);
								ChoiceButton3.setEnabled(false);
								ChoiceButton4.setEnabled(false);
								ChoiceButton5.setEnabled(false);
								ChoiceButton6.setEnabled(false);
								ChoiceButton7.setEnabled(false);
								ChoiceButton8.setEnabled(false);
								ChoiceButton9.setEnabled(false);
							}
		}
		if(e.getSource() == ChoiceButton8)
				{
					ChoiceButton8.setVisible(false);
					ChoiceButton8.setEnabled(false);
					if(PlayerOneTurn == 1)
					{
						X8d = true;
						PlayerOneTurn = 0;
						PlayerTwoLabel.setFont(ActivePlayer);
						PlayerOneLabel.setFont(InActivePlayer);
					}


					else if(PlayerOneTurn != 1)
					{
						O8d = true;
						PlayerOneTurn = 1;
						PlayerTwoLabel.setFont(ActivePlayer);
					}
							//X Winner Test

							if(X1d == true && X2d == true && X3d == true)
							{
								WinnerX = true;
							}
							if(X4d == true && X5d == true && X6d == true)
							{
								WinnerX = true;
							}
							if(X7d == true && X8d == true && X9d == true)
							{
								WinnerX = true;
							}
							/////////////////////////////////////////////
							if(X1d == true && X4d == true && X7d == true)
							{
								WinnerX = true;
							}
							if(X2d == true && X5d == true && X8d == true)
							{
								WinnerX = true;
							}
							if(X3d == true && X6d == true && X9d == true)
							{
								WinnerX = true;
							}
							////////////////////////////////////////////
							if(X1d == true && X5d == true && X9d == true)
							{
								WinnerX = true;
							}
							if(X3d == true && X5d == true && X7d == true)
							{
								WinnerX = true;
							}
							//
							///////////////////////////////////////////
							//O Winner Test
							if(O1d == true && O2d == true && O3d == true)
							{
								WinnerO = true;
							}
							if(O4d == true && O5d == true && O6d == true)
							{
								WinnerO = true;
							}
							if(O7d == true && O8d == true && O9d == true)
							{
								WinnerO = true;
							}
							/////////////////////////////////////////////
							if(O1d == true && O4d == true && O7d == true)
							{
								WinnerO = true;
							}
							if(O2d == true && O5d == true && O8d == true)
							{
								WinnerO = true;
							}
							if(O3d == true && O6d == true && O9d == true)
							{
								WinnerO = true;
							}
							////////////////////////////////////////////
							if(O1d == true && O5d == true && O9d == true)
							{
								WinnerO = true;
							}
							if(O3d == true && O5d == true && O7d == true)
							{
								WinnerO = true;
							}
							/////////////////////////////////////////////
							// Winner
							if(WinnerX == true)
							{
								PlayerOneLabel.setFont(InActivePlayer);
								PlayerTwoLabel.setFont(InActivePlayer);
								WinnerOne.setVisible(true);

								ChoiceButton1.setEnabled(false);
								ChoiceButton2.setEnabled(false);
								ChoiceButton3.setEnabled(false);
								ChoiceButton4.setEnabled(false);
								ChoiceButton5.setEnabled(false);
								ChoiceButton6.setEnabled(false);
								ChoiceButton7.setEnabled(false);
								ChoiceButton8.setEnabled(false);
								ChoiceButton9.setEnabled(false);
							}
							if(WinnerO == true)
							{
								PlayerOneLabel.setFont(InActivePlayer);
								PlayerTwoLabel.setFont(InActivePlayer);
								WinnerTwo.setVisible(true);

								ChoiceButton1.setEnabled(false);
								ChoiceButton2.setEnabled(false);
								ChoiceButton3.setEnabled(false);
								ChoiceButton4.setEnabled(false);
								ChoiceButton5.setEnabled(false);
								ChoiceButton6.setEnabled(false);
								ChoiceButton7.setEnabled(false);
								ChoiceButton8.setEnabled(false);
								ChoiceButton9.setEnabled(false);
							}
		}
		if(e.getSource() == ChoiceButton9)
				{
					ChoiceButton9.setVisible(false);
					ChoiceButton9.setEnabled(false);
					if(PlayerOneTurn == 1)
					{
						X9d = true;
						PlayerOneTurn = 0;
						PlayerTwoLabel.setFont(ActivePlayer);
						PlayerOneLabel.setFont(InActivePlayer);
					}


					else if(PlayerOneTurn != 1)
					{
						O9d = true;
						PlayerOneTurn = 1;
						PlayerTwoLabel.setFont(ActivePlayer);
					}
							//X Winner Test

							if(X1d == true && X2d == true && X3d == true)
							{
								WinnerX = true;
							}
							if(X4d == true && X5d == true && X6d == true)
							{
								WinnerX = true;
							}
							if(X7d == true && X8d == true && X9d == true)
							{
								WinnerX = true;
							}
							/////////////////////////////////////////////
							if(X1d == true && X4d == true && X7d == true)
							{
								WinnerX = true;
							}
							if(X2d == true && X5d == true && X8d == true)
							{
								WinnerX = true;
							}
							if(X3d == true && X6d == true && X9d == true)
							{
								WinnerX = true;
							}
							////////////////////////////////////////////
							if(X1d == true && X5d == true && X9d == true)
							{
								WinnerX = true;
							}
							if(X3d == true && X5d == true && X7d == true)
							{
								WinnerX = true;
							}
							//
							///////////////////////////////////////////
							//O Winner Test
							if(O1d == true && O2d == true && O3d == true)
							{
								WinnerO = true;
							}
							if(O4d == true && O5d == true && O6d == true)
							{
								WinnerO = true;
							}
							if(O7d == true && O8d == true && O9d == true)
							{
								WinnerO = true;
							}
							/////////////////////////////////////////////
							if(O1d == true && O4d == true && O7d == true)
							{
								WinnerO = true;
							}
							if(O2d == true && O5d == true && O8d == true)
							{
								WinnerO = true;
							}
							if(O3d == true && O6d == true && O9d == true)
							{
								WinnerO = true;
							}
							////////////////////////////////////////////
							if(O1d == true && O5d == true && O9d == true)
							{
								WinnerO = true;
							}
							if(O3d == true && O5d == true && O7d == true)
							{
								WinnerO = true;
							}
							/////////////////////////////////////////////
							// Winner
							if(WinnerX == true)
							{
								PlayerOneLabel.setFont(InActivePlayer);
								PlayerTwoLabel.setFont(InActivePlayer);
								WinnerOne.setVisible(true);

								ChoiceButton1.setEnabled(false);
								ChoiceButton2.setEnabled(false);
								ChoiceButton3.setEnabled(false);
								ChoiceButton4.setEnabled(false);
								ChoiceButton5.setEnabled(false);
								ChoiceButton6.setEnabled(false);
								ChoiceButton7.setEnabled(false);
								ChoiceButton8.setEnabled(false);
								ChoiceButton9.setEnabled(false);
							}
							if(WinnerO == true)
							{
								PlayerOneLabel.setFont(InActivePlayer);
								PlayerTwoLabel.setFont(InActivePlayer);
								WinnerTwo.setVisible(true);

								ChoiceButton1.setEnabled(false);
								ChoiceButton2.setEnabled(false);
								ChoiceButton3.setEnabled(false);
								ChoiceButton4.setEnabled(false);
								ChoiceButton5.setEnabled(false);
								ChoiceButton6.setEnabled(false);
								ChoiceButton7.setEnabled(false);
								ChoiceButton8.setEnabled(false);
								ChoiceButton9.setEnabled(false);
							}
		}
		if(e.getSource() == PlayAgain)
		{
			WinnerTwo.setVisible(false);
			WinnerOne.setVisible(false);
			ChoiceButton1.setVisible(true);
			ChoiceButton2.setVisible(true);
			ChoiceButton3.setVisible(true);
			ChoiceButton4.setVisible(true);
			ChoiceButton5.setVisible(true);
			ChoiceButton6.setVisible(true);
			ChoiceButton7.setVisible(true);
			ChoiceButton8.setVisible(true);
			ChoiceButton9.setVisible(true);
			ChoiceButton1.setEnabled(true);
			ChoiceButton2.setEnabled(true);
			ChoiceButton3.setEnabled(true);
			ChoiceButton4.setEnabled(true);
			ChoiceButton5.setEnabled(true);
			ChoiceButton6.setEnabled(true);
			ChoiceButton7.setEnabled(true);
			ChoiceButton8.setEnabled(true);
			ChoiceButton9.setEnabled(true);
			WinnerX = false;
			WinnerO = false;

			PlayerOneTurn = 1;

			X1d = false;
			X2d = false;
			X3d = false;
			X4d = false;
			X5d = false;
			X6d = false;
			X7d = false;
			X8d = false;
			X9d = false;

			O1d = false;
			O2d = false;
			O3d = false;
			O4d = false;
			O5d = false;
			O6d = false;
			O7d = false;
			O8d = false;
			O9d = false;
		}
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		StartButton.setBounds(150,200,100,20);
		PlayerOneName.setBounds(30,75,150,50);
		PlayerTwoName.setBounds(240,75,150,50);
		PlayerOneField.setBounds(50,150,100,20);
		PlayerTwoField.setBounds(250,150,100,20);
		TicTacToeLabel.setBounds(110,10,300,50);
		if(Start == true)
		{
			PlayAgain.setVisible(true);
			PlayerOneLabel.setVisible(true);
			PlayerTwoLabel.setVisible(true);
			NameLabel.setVisible(true);
			setSize(408,600);
			g.drawImage(Background,4,4,this);

			NameLabel.setBounds(110,400,200,50);
			PlayerOneLabel.setBounds(20,450,100,50);
			PlayerTwoLabel.setBounds(290,450,100,50);
			WinnerOne.setBounds(20,500,100,50);
			WinnerTwo.setBounds(290,500,100,50);
			PlayAgain.setBounds(150,550,100,20);

			NameLabel.paint(g);
			PlayerOneLabel.paint(g);
			PlayerTwoLabel.paint(g);
			WinnerOne.paint(g);
			WinnerTwo.paint(g);

			//X

			if(X1d == true)
			{
				g.drawImage(X1,20,10,this);
			}
			if(X2d == true)
			{
				g.drawImage(X2,160,10,this);
			}
			if(X3d == true)
			{
				g.drawImage(X3,300,10,this);
			}
			if(X4d == true)
			{
				g.drawImage(X21,20,150,this);
			}
			if(X5d == true)
			{
				g.drawImage(X22,160,150,this);
			}
			if(X6d == true)
			{
				g.drawImage(X23,300,150,this);
			}
			if(X7d == true)
			{
				g.drawImage(X31,20,290,this);
			}
			if(X8d == true)
			{
				g.drawImage(X32,160,290,this);
			}
			if(X9d == true)
			{
				g.drawImage(X33,300,290,this);
			}

			//O

			if(O1d == true)
			{
				g.drawImage(O1,20,10,this);
			}
			if(O2d == true)
			{
				g.drawImage(O2,160,10,this);
			}
			if(O3d == true)
			{
				g.drawImage(O3,300,10,this);
			}
			if(O4d == true)
			{
				g.drawImage(O21,20,150,this);
			}
			if(O5d == true)
			{
				g.drawImage(O22,160,150,this);
			}
			if(O6d == true)
			{
				g.drawImage(O23,300,150,this);
			}
			if(O7d == true)
			{
				g.drawImage(O31,20,290,this);
			}
			if(O8d == true)
			{
				g.drawImage(O32,160,290,this);
			}
			if(O9d == true)
			{
				g.drawImage(O33,300,290,this);
			}
			ChoiceButton1.setBounds(20,10,100,94);
			ChoiceButton2.setBounds(160,10,100,94);
			ChoiceButton3.setBounds(290,10,100,94);
			ChoiceButton4.setBounds(20,150,100,94);
			ChoiceButton5.setBounds(160,150,100,94);
			ChoiceButton6.setBounds(290,150,100,94);
			ChoiceButton7.setBounds(20,280,100,94);
			ChoiceButton8.setBounds(160,280,100,94);
			ChoiceButton9.setBounds(290,280,100,94);
		}
	}
}