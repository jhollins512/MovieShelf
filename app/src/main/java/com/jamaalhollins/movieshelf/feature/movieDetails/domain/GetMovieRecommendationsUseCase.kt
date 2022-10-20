package com.jamaalhollins.movieshelf.feature.movieDetails.domain

import com.jamaalhollins.movieshelf.core.domain.model.Media
import com.jamaalhollins.movieshelf.core.domain.repository.MediaRepository

class GetMovieRecommendationsUseCase(private val mediaRepository: MediaRepository) {
    suspend operator fun invoke(movieId: Int): List<Media> {
        return mediaRepository.getMovieRecommendations(movieId).results
    }
}