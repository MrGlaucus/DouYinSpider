package com.glaucus.entity


data class User(
		val user_info: UserInfo,
		val position: List<Position>,
		val uniqid_position: List<UniqidPosition>
)

data class UserInfo(
		val following_count: Int,
		val share_qrcode_uri: String,
		val avatar_larger: AvatarLarger,
		val enterprise_verify_reason: String,
		val story_open: Boolean,
		val live_verify: Int,
		val short_id: String,
		val account_region: String,
		val reflow_page_gid: Int,
		val avatar_thumb: AvatarThumb,
		val is_binded_weibo: Boolean,
		val is_verified: Boolean,
		val hide_search: Boolean,
		val risk_flag: Int,
		val with_commerce_entry: Boolean,
		val school_name: String,
		val custom_verify: String,
		val aweme_count: Int,
		val special_lock: Int,
		val shield_comment_notice: Int,
		val total_favorited: Int,
		val favoriting_count: Int,
		val hide_location: Boolean,
		val gender: Int,
		val star_use_new_download: Boolean,
		val school_poi_id: String,
		val activity: Activity,
		val weibo_schema: String,
		val uid: String,
		val bind_phone: String,
		val weibo_url: String,
		val weibo_name: String,
		val commerce_user_level: Int,
		val create_time: Int,
		val story_count: Int,
		val verify_info: String,
		val constellation: Int,
		val community_discipline_status: Int,
		val has_register_notice: Int,
		val need_recommend: Int,
		val shield_digg_notice: Int,
		val update_before: Int,
		val verification_type: Int,
		val room_id: Int,
		val avatar_medium: AvatarMedium,
		val follower_count: Int,
		val authority_status: Int,
		val enterprise_verify: Boolean,
		val live_rec_level: Int,
		val reflow_page_uid: Int,
		val birthday: String,
		val is_ad_fake: Boolean,
		val nickname: String,
		val shield_follow_notice: Int,
		val follow_status: Int,
		val region: String,
		val nickname_lock: Int,
		val school_type: Int,
		val avatar_uri: String,
		val signature: String,
		val weibo_verify: String,
		val unique_id: String
)

data class AvatarThumb(
		val url_list: List<String>,
		val uri: String
)

data class AvatarMedium(
		val url_list: List<String>,
		val uri: String
)

data class Activity(
		val use_music_count: Int,
		val digg_count: Int
)

data class AvatarLarger(
		val url_list: List<String>,
		val uri: String
)

data class Position(
		val begin: Int,
		val end: Int
)

data class UniqidPosition(
		val begin: Int,
		val end: Int
)