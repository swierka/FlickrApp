package pwr.edu.pl.flickr.flickrpublicfeed.ui.publicfeed.databinding

import android.databinding.BindingAdapter
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Michal S. on 05.12.2017.
 * Bindings for Public Feed items on the list
 */
@BindingAdapter("publishedDateBind")
fun bindPublishedDate(textView: TextView, date: Date?) {
    if (date != null) {
        textView.text = SimpleDateFormat.getDateTimeInstance().format(date)
    }
}
