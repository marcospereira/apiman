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
package org.overlord.apiman.dt.ui.client.local.widgets;

import com.google.gwt.user.client.ui.InlineLabel;

/**
 * Same as {@link InlineLabel} but removes the GWT classes.
 *
 * @author eric.wittmann@redhat.com
 */
public class SpanLabel extends InlineLabel {

    /**
     * Constructor.
     */
    public SpanLabel() {
        getElement().setClassName(""); //$NON-NLS-1$
    }
    
    /**
     * Constructor.
     * @param label
     */
    public SpanLabel(String label) {
        super(label);
        getElement().setClassName(""); //$NON-NLS-1$
    }
    
}
