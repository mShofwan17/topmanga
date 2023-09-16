package dicoding.submission.topmanga.utils.extension

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import dicoding.submission.topmanga.R
import jp.wasabeef.glide.transformations.BlurTransformation

fun ImageView.loadImage(url: String) {
    Glide.with(this.rootView.context)
        .load(url)
        .error(R.drawable.berserk)
        .into(this)
}

fun ImageView.loadImageCircle(url: String) {
    Glide.with(this.rootView.context)
        .load(url)
        .circleCrop()
        .error(R.drawable.berserk)
        .into(this)
}

fun ImageView.loadImageBlur(url: String) {
    Glide.with(this.rootView.context).asBitmap()
        .apply(RequestOptions.bitmapTransform(BlurTransformation(15, 3)))
        .load(url)
        .into(this)
}