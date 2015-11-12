/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.management.service;

import io.gravitee.management.model.analytics.HistogramAnalytics;

/**
 * @author David BRASSELY (brasseld at gmail.com)
 */
public interface AnalyticsService {

    HistogramAnalytics apiHits(String apiName, long from, long to, long interval);

    HistogramAnalytics apiHitsByStatus(String apiName, long from, long to, long interval);

    HistogramAnalytics apiHitsByLatency(String apiName, long from, long to, long interval);

    HistogramAnalytics apiHitsByApiKey(String apiName, long from, long to, long interval);

    HistogramAnalytics apiKeyHits(String apiKey, long from, long to, long interval);

    HistogramAnalytics apiKeyHitsByStatus(String apiKey, long from, long to, long interval);

    HistogramAnalytics apiKeyHitsByLatency(String apiKey, long from, long to, long interval);
}