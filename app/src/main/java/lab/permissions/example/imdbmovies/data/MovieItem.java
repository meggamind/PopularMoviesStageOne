package lab.permissions.example.imdbmovies.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.method.MovementMethod;
import android.util.Log;

import java.io.Serializable;

/**
 * Created by aniket on 5/14/17.
 */

public class MovieItem implements Parcelable {
    private String title;
    private String movie_poster;
    private String movie_backdrop;
    private String movie_overview;
    private float vote_average;
    private String release_date;
    private String original_title;


    public MovieItem(Parcel in) {
        title = in.readString();
        movie_poster = in.readString();
        movie_backdrop = in.readString();
        movie_overview = in.readString();
        vote_average = in.readFloat();
        release_date = in.readString();
        original_title = in.readString();
    }

    public MovieItem(){

    }


    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(movie_poster);
        dest.writeString(movie_backdrop);
        dest.writeString(movie_overview);
        dest.writeFloat(vote_average);
        dest.writeString(release_date);
        dest.writeString(original_title);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<MovieItem> CREATOR
            = new Parcelable.Creator<MovieItem>() {

        @Override
        public MovieItem createFromParcel(Parcel in) {
            return new MovieItem(in);
        }

        @Override
        public MovieItem[] newArray(int size) {
            return new MovieItem[size];
        }
    };





    public String getTitle(){return title;}
    public void setTitle(String title){
        this.title = title;
    }

    public String getMovie_poster(){
        return movie_poster;
    }
    public void setMovie_poster(String movie_poster){
        this.movie_poster = movie_poster;
    }

    public String getMovie_overview(){
        return movie_overview;
    }
    public void setMovie_overview(String movie_overview){
        this.movie_overview = movie_overview;
    }

    public float getMovie_vote(){
        return vote_average;
    }
    public void setMovie_vote(float vote_average){
        this.vote_average = vote_average;
    }

    public String getMovie_releaseDate(){
        return release_date;
    }
    public void setMovie_releaseDate(String release_date){
        this.release_date = release_date;
    }

    public String getMovie_backdrop(){
        return movie_backdrop;
    }
    public void setMovie_backdrop(String movie_backdrop){
        this.movie_backdrop = movie_backdrop;
    }

    public String getOriginalTitle(){return original_title;}
    public void setOriginalTitle(String original_title){
        this.original_title = original_title;
    }

}
