/*
 * Copyright 2014 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.provider;

/**
 * Interface describing the builder capabilities that Providers implement in Stormpath.
 *
 * @param <ARB> A reification of {@link ProviderAccountRequestBuilder}
 * @param <PRB> A reification of {@link CreateProviderRequestBuilder}
 * @since 1.0.beta
 */
public interface ProviderRequestFactory<ARB extends ProviderAccountRequestBuilder, PRB extends CreateProviderRequestBuilder> {

    /**
     * Returns a builder to generate an attempt to create or retrieve a Provider {@link com.stormpath.sdk.account.Account}
     * from Stormpath.
     *
     * @return a builder to generate an attempt to create or retrieve a Provider {@link com.stormpath.sdk.account.Account}
     * from Stormpath.
     */
    ARB accountRequest();

    /**
     * Returns a builder to generate an attempt to create a Provider-based {@link com.stormpath.sdk.directory.Directory}
     * in Stormpath.
     *
     * @return a builder to generate an attempt to create a Provider-based {@link com.stormpath.sdk.directory.Directory}
     * in Stormpath.
     */
    PRB createProviderRequest();

}
