package finals;


import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;


public class ReserveSeatsFrame extends javax.swing.JFrame {
    private static final int numRows = 10;
    private static final int seatRows = 10;
    private boolean[][] seats;
   
public ReserveSeatsFrame(boolean[][] seats) {
    this.seats = seats;
    initComponents();
    updateSeatsTable();
    seatsTable.setDefaultRenderer(Object.class, new SeatCellRenderer());
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        reserveButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        priceTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        numTicketsComboBox = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        seatsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        seatsTable = new javax.swing.JTable();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Number of Tickets: ");

        reserveButton.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        reserveButton.setText("RESERVE");
        reserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveButtonActionPerformed(evt);
            }
        });

        priceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"                    1 ", "               1,000"},
                {"                    2", "               2,000"},
                {"                    3", "               3,000"},
                {"                    4 ", "               4,000"},
                {"                    5", "               5,000"},
                {"                    6", "               6,000"},
                {"                    7", "               7,000"},
                {"                    8", "               8,000"},
                {"                    9", "               9,000"},
                {"                   10", "              10,000"}
            },
            new String [] {
                "Row", "Price"
            }
        ));
        jScrollPane1.setViewportView(priceTable);

        jLabel4.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12)); // NOI18N
        jLabel4.setText("SEAT PRICES");

        numTicketsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        numTicketsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTicketsComboBoxActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        seatsPanel.setLayout(new java.awt.GridLayout(1, 0));

        seatsPanel.setLayout(new GridLayout(0, 2, 10, 10));

        String[] columnNames = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "Row No."};
        seatsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [numRows][seatRows + 1],
            columnNames
        ){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Makes the cells uneditable
            }
        });
        jScrollPane2.setViewportView(seatsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(numTicketsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(seatsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(errorLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reserveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numTicketsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backButton)))
                        .addGap(6, 6, 6)
                        .addComponent(seatsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(errorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reserveButton)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Calculate the total price depending on the row chosen
    private int calculateTicketPrice(int row) {
        return (row + 1) * 1000;
    }
    
    // Logic for Reserving a Seat
    private void reserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveButtonActionPerformed
    int numTickets = numTicketsComboBox.getSelectedIndex() + 1;
    boolean success = true;
    String errorMessage = "";
    int totalPrice = 0;

    for (int i = 0; i < numTickets; i++) {
        JComboBox<String> columnComboBox = (JComboBox<String>) seatsPanel.getComponent(i * 4 + 1);
        JComboBox<String> rowComboBox = (JComboBox<String>) seatsPanel.getComponent(i * 4 + 3);

        String columnString = (String) columnComboBox.getSelectedItem();
        String rowString = (String) rowComboBox.getSelectedItem();

        try {
            int column = columnString.charAt(0) - 'A';
            int row = Integer.parseInt(rowString) - 1;
            if (row < 0 || row >= numRows || column < 0 || column >= seatRows || !seats[row][column]) {
                success = false;
                errorMessage = "Invalid or already reserved seat!";
                break;
            }
            seats[row][column] = false;
            totalPrice += calculateTicketPrice(row);
        } catch (NumberFormatException e) {
            success = false;
            errorMessage = "Invalid input!";
            break;
        }
    }

    if (success) {
        JOptionPane.showMessageDialog(this, "Total price: " + totalPrice, "Reservation Successful", JOptionPane.INFORMATION_MESSAGE);
        updateSeatsTable();
    } else {
        JOptionPane.showMessageDialog(this, errorMessage, "Reservation Failed", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_reserveButtonActionPerformed
    
    // Adds Combo Boxes depending on the amount of tickets picked from the numTicketsComboBox
    private void numTicketsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTicketsComboBoxActionPerformed
        seatsPanel.removeAll();

        int numTickets = numTicketsComboBox.getSelectedIndex() + 1;
        String[] columns = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = String.valueOf(i + 1);
        }

        for (int i = 0; i < numTickets; i++) {
            seatsPanel.add(new JLabel("Column for Ticket " + (i + 1) + ":"));
            seatsPanel.add(new JComboBox<>(columns));
            seatsPanel.add(new JLabel("Row for Ticket " + (i + 1) + ":"));
            seatsPanel.add(new JComboBox<>(rows));
        }

        seatsPanel.revalidate();
        seatsPanel.repaint();
    }//GEN-LAST:event_numTicketsComboBoxActionPerformed

    // Back Button
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
    
    new MainFrame(seats).setVisible(true);
    this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    // Updates the Table Visual "Available" "Reserved" depending on the chosen seat
private void updateSeatsTable() {
    DefaultTableModel model = (DefaultTableModel) seatsTable.getModel();
    for (int i = 0; i < seats.length; i++) {
        for (int j = 0; j < seats[i].length; j++) {
            model.setValueAt(seats[i][j] ? "Available" : "Reserved", i, j);
        }
        model.setValueAt(i + 1, i, seatRows); // Set the row number
    }
}
    
    // Changes the Color of the "Available" seats to Green and "Reserved" seats to Red
    private class SeatCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if ("Available".equals(value)) {
            cell.setBackground(Color.GREEN);
        } else if ("Reserved".equals(value)) {
            cell.setBackground(Color.RED);
        } else {
            cell.setBackground(Color.WHITE);
        }
        return cell;
        }
    }
    
    public static void main(String args[]) {
        boolean[][] seats = new boolean[10][10]; // Initialize with your actual seat data
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                seats[i][j] = true; // All seats are initially available
            }
        }
        ReserveSeatsFrame frame = new ReserveSeatsFrame(seats);
        frame.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> numTicketsComboBox;
    private javax.swing.JTable priceTable;
    private javax.swing.JButton reserveButton;
    private javax.swing.JPanel seatsPanel;
    private javax.swing.JTable seatsTable;
    // End of variables declaration//GEN-END:variables


    }

