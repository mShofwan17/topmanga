package dicoding.submission.topmanga.utils.extension

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

fun RecyclerView.linearLayoutManager(isHorizontal: Boolean = false){
    val layoutManager = if (!isHorizontal) LinearLayoutManager(this.context)
    else LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false)
    this.layoutManager = layoutManager
}

fun RecyclerView.gridLayoutManager(spanCount: Int){
    val layoutManager = GridLayoutManager(this.context,spanCount)
    this.layoutManager = layoutManager
}
