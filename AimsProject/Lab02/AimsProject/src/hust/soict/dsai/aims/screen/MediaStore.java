package hust.soict.dsai.aims.screen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.media.Playable;
import hust.soict.dsai.aims.store.Store.Store;

public class MediaStore extends JPanel {
        private Media media;
        private Cart cart;

        public MediaStore(Media media,Cart currentCart) {

            this.media = media;
            this.cart=currentCart;
            this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
            ButtonListener btnListener = new ButtonListener();
    		

            JLabel title = new JLabel(media.getTitle());
            title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
            title.setAlignmentX(CENTER_ALIGNMENT);

            JLabel cost = new JLabel("" + media.getCost() + " $");
            cost.setAlignmentX(CENTER_ALIGNMENT);

            JPanel container = new JPanel();
            container.setLayout(new FlowLayout(FlowLayout.CENTER));

            container.add(new JButton("Add to cart"));
            
            addToCartButton.addActionListener(btnListener);
            
            if (media instanceof Playable) {
            	JButton playButton = new JButton("Play");
    			container.add(playButton);
    			playButton.addActionListener(btnListener);
            }

            this.add(Box.createVerticalGlue());
            this.add(title);
            this.add(cost);
            this.add(Box.createVerticalGlue());
            this.add(container);

            this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
    

private class ButtonListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if(button.equals("Play")) {
			try {
				JFrame newFrame = new JFrame();
				JTextField tfDisplay = new JTextField();
				tfDisplay.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
				String content, title;
				if(media instanceof DigitalVideoDisc) {
					DigitalVideoDisc d = (DigitalVideoDisc) media;
					content = d.toString();
					title = d.getTitle();
				}
				else {
					CompactDisc d = (CompactDisc) media;
					content = d.toString();
					title = d.getTitle();
				}
				JDialog dl = new JDialog(newFrame, title);
				tfDisplay.setText(content);
				
				dl.add(tfDisplay);
				dl.setLayout(new FlowLayout());
				dl.setSize(300, 300);
				dl.setVisible(true);
			} catch (HeadlessException e1) {
				e1.printStackTrace();
			} catch (PlayerException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage());
				e1.printStackTrace();
			}
		}
		if(button.equals("Add to cart")) {
			cart.addMedia(media);
		}
	}
}
}