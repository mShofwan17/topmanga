package dicoding.submission.topmanga.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import dicoding.submission.topmanga.data.model_source.Character
import dicoding.submission.topmanga.databinding.ItemCharacterBinding
import dicoding.submission.topmanga.databinding.ItemMangaBinding
import dicoding.submission.topmanga.domain.model.HomeManga
import dicoding.submission.topmanga.utils.extension.loadImage

class ListCharacterAdapter(
    private val items: List<Character>
) : RecyclerView.Adapter<ListCharacterAdapter.ViewHolder>() {

    class ViewHolder(private val binding: ItemCharacterBinding, private val adapter: ListCharacterAdapter) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Character, position: Int) {
            binding.apply {
                txtName.text = item.name
                imgMain.loadImage(item.imageUrl)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding, this)
    }

    override fun getItemCount(): Int = items.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(item = items[position], position)
    }
}