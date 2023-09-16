package dicoding.submission.topmanga.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dicoding.submission.topmanga.databinding.ItemMangaBinding
import dicoding.submission.topmanga.domain.model.HomeManga
import dicoding.submission.topmanga.utils.extension.loadImage

class ListMangaAdapter(
    private val items: List<HomeManga>,
    private val onClick: (item: HomeManga, rank: String) -> Unit
) : RecyclerView.Adapter<ListMangaAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemMangaBinding, private val adapter: ListMangaAdapter) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: HomeManga, position: Int) {
            binding.apply {
                val rank = "#${position+1}"

                txtTitle.text = item.name
                txtSubtitle.text = item.desc
                txtScore.text = item.score.toString()
                txtRank.text = rank
                imgMain.loadImage(item.imageUrl)

                root.setOnClickListener {
                    adapter.onClick.invoke(item,rank)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMangaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding, this)
    }

    override fun getItemCount(): Int = items.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(item = items[position], position)
    }
}