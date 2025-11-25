package sample

import com.lagradost.cloudstream3.*

class SampleProvider : MainAPI() {
    override var mainUrl = "https://example.com"
    override var name = "Sample"

    override fun search(query: String): List<SearchResponse> {
        return listOf()
    }
}
