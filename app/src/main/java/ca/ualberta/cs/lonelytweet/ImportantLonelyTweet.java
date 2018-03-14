package ca.ualberta.cs.lonelytweet;

import android.util.Log;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	public ImportantLonelyTweet() {
	}
	//exchange date to new date
	public ImportantLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		String string = getTweetDate() + " | " + getTweetBody();
		//imported android.util.log
		Log.i("ImportantLonelyTweet", string);
		return string;
	}


	public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}