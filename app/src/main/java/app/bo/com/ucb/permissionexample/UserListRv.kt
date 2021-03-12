package app.bo.com.ucb.permissionexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.bo.com.ucb.permissionexample.data.User
import kotlinx.android.synthetic.main.user_row.view.*

class UserListRv(val list: ArrayList<User>, val applicationContext: Context?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false)
        return UserLisTvViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.count()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       val user = list.get(position)
        holder.itemView.user_email.text = user.email
        holder.itemView.user_name.text = user.name
    }

    class UserLisTvViewHolder(item: View): RecyclerView.ViewHolder(item)

}
