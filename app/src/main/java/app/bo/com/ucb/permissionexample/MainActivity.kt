package app.bo.com.ucb.permissionexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import androidx.recyclerview.widget.LinearLayoutManager
import app.bo.com.ucb.permissionexample.data.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val webView = WebView(applicationContext)
//        webView.settings.javaScriptEnabled = true
//        setContentView(webView)
//        webView.loadUrl("https://www.google.com")
        setContentView(R.layout.activity_main)

        val list = arrayListOf<User>(
            User("Roberto Carlos", "rcallisaya@ucb.edu.bo"),
            User( "Gabriela", "gorellena@ucb.edu.bo" ),
            User("Roberto Carlos", "rcallisaya@ucb.edu.bo"),
            User( "Gabriela", "gorellena@ucb.edu.bo" ),
            User("Roberto Carlos", "rcallisaya@ucb.edu.bo"),
            User( "Gabriela", "gorellena@ucb.edu.bo" ), User("Roberto Carlos", "rcallisaya@ucb.edu.bo"),
            User( "Gabriela", "gorellena@ucb.edu.bo" ),
                    User("Roberto Carlos", "rcallisaya@ucb.edu.bo"),
        User( "Gabriela", "gorellena@ucb.edu.bo" )
        )

        val adLayoutManger = LinearLayoutManager(applicationContext)
        adLayoutManger.orientation = LinearLayoutManager.VERTICAL

        user_rv.layoutManager = adLayoutManger

        user_rv.adapter = UserListRv(list, applicationContext)

    }
}