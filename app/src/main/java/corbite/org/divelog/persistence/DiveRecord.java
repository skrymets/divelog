/*
 * Copyright (c) 2018.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 */

package corbite.org.divelog.persistence;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by skrymets on 2018-03-09.
 */

@Entity(tableName = "records",
        foreignKeys = {
                @ForeignKey(entity = DiveSite.class,
                        parentColumns = "id",
                        childColumns = "site_id",
                        onDelete = ForeignKey.CASCADE)}
        })
public class DiveRecord implements Serializable {

    private int number;

    @ColumnInfo(name = "site_id")
    private String siteId;

    @PrimaryKey
    // Contains both: Dive Date and Water Entry Time
    private Date entryTime;

    // Only time component is valuable
    private Date bottomTime;

    private float maximumDepth;

    private String notes;
}
