/*
 * Copyright (c) 2014-2018 T-Systems Multimedia Solutions GmbH
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

package de.tsystems.mms.apm.performancesignature.dynatrace.model;

import org.kohsuke.stapler.export.Exported;
import org.kohsuke.stapler.export.ExportedBean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@ExportedBean
public class Measurement extends MeasureBaseModel {
    @XmlAttribute
    private long timestamp;

    public Measurement(final long timestamp, final Number avg, final Number min, final Number max, final Number sum,
                       final Number count) {
        this.timestamp = timestamp;
        this.setAvg(avg.doubleValue());
        this.setMin(min.doubleValue());
        this.setMax(max.doubleValue());
        this.setSum(sum.doubleValue());
        this.setCount(count.longValue());
    }

    public Measurement() {
    }

    /**
     * Ruft den Wert der timestamp-Eigenschaft ab.
     *
     * @return possible object is
     * {@link long }
     */
    @Exported
    public long getTimestamp() {
        return timestamp;
    }
}
