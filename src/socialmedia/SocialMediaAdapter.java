/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

/**
 *
 * @author kmmac
 */
public class SocialMediaAdapter implements SocialMediaEntry{

    YouTubeVideo youTubeVid;
    
    public SocialMediaAdapter(YouTubeVideo youTubeVideo) {
        this.youTubeVid = youTubeVideo;
    }
    
    @Override
    public String getUser() {
        return youTubeVid.getAuthor();
    }

    @Override
    public String getPostText() {
        String PostText = youTubeVid.getTitle() + ": " +  youTubeVid.getDescription();
        return PostText;
    }
    
}
