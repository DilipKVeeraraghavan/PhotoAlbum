package photoalbum;

import javax.swing.JFrame;

public class PhotoAlbum {

    public static void main(String[] args) {
        Album album = new Album();
        album.setVisible(true);
        album.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
