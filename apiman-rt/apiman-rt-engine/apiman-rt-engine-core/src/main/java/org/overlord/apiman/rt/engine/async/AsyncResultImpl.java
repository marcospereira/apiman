/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.overlord.apiman.rt.engine.async;

/**
 * A simple implementation of the async result interface.  Offers convenient
 * creation of result instances.
 * 
 * @author Marc Savy <msavy@redhat.com>
 */
public class AsyncResultImpl<T> implements IAsyncResult<T> {
    
    private T result;
    private Throwable error;
    
    /**
     * Convenience method for creating an async result.
     * @param result
     */
    public static final <T> AsyncResultImpl<T> create(T result) {
        AsyncResultImpl<T> ar = new AsyncResultImpl<T>(result);
        return ar;
    }
    
    /**
     * Convenience method for creating an async result.
     * @param t
     */
    public static final <T> AsyncResultImpl<T> create(Throwable t) {
        AsyncResultImpl<T> ar = new AsyncResultImpl<T>(t);
        return ar;
    }
    
    /**
     * Constructor.
     * @param result
     */
    private AsyncResultImpl(T result) {
        this.result = result;
    }

    /**
     * Constructor.
     * @param error
     */
    private AsyncResultImpl(Throwable error) {
        this.error = error;
    }

    /**
     * @see org.overlord.apiman.rt.engine.async.IAsyncResult#isSuccess()
     */
    @Override
    public boolean isSuccess() {
        return error == null;
    }

    /**
     * @see org.overlord.apiman.rt.engine.async.IAsyncResult#isError()
     */
    @Override
    public boolean isError() {
        return error != null;
    }

    /**
     * @see org.overlord.apiman.rt.engine.async.IAsyncResult#getResult()
     */
    @Override
    public T getResult() {
        return result;
    }

    /**
     * @see org.overlord.apiman.rt.engine.async.IAsyncResult#getError()
     */
    @Override
    public Throwable getError() {
        return error;
    }

}
