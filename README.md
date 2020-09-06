# ReadTimeCounter
A Simple Android library to get the number of words and give you the time it will take you to finish an article/story.

# Prerequisite
<ul>
    <li>Androidx</li>
    <li>Java</li>
</ul>

# How to set up

And add a dependency code to your module's build.gradle file. <br />

    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Add below codes to your root build.gradle file (not your module build.gradle file). <br />

   dependencies {
   	        implementation 'com.github.samchuks:Read-Time:Tag'
   	}

# Example

    package com.oshabz.readtimecounter;

    import android.os.Bundle;
    import android.util.Log;
    import android.widget.Toast;

    import androidx.appcompat.app.AppCompatActivity;
    public class MainActivity  extends AppCompatActivity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            String ty =
                    "The coinlayer API's live endpoint is used to get the latest crypto rates for all available or a specific set of cryptocurrencies. " +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +

                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +

                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options." +
                            "To use this endpoint, simply append live to your API request URL, followed by your API access key and any of your preferred options.";

            String you = "f your audience reads slower or faster than 200 words per minute — \n" +
                    "        perhaps your blog is in English, which isn’t your audience’s first language, or perhaps your material is extremely\n" +
                    "        basic and easy to skim — then you’ll want to use calculator instead. First, you’ll have to divide your total word \n" +
                    "        count by the average words read per minute of your audience. Let’s say your 938-word article has an audience that \n" +
                    "        reads 150 words per minute. That gives you 6.253. Enter 6.253 into the Decimal-to-Time Calculator, choose “Minutes” \n" +
                    "        from the drop-down menu and press “Calculate.”\n" +
                    "        Immediately, you’ll get a minute and seconds estimate. In this case, it’s 6 minutes and 15 seconds.";

            String text = String.valueOf(ReadTime.countWords(ty));
            String readTime = ReadTime.readTime(ty);

            Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            Log.d(null, "onCreate: " + text);
        }
    }

# Contributions and Issues
Feel free to open an issue if any or contribute to it, its an open source library.

# Author
Oshaba Samson - Web and Android Engineer @ Digital Core