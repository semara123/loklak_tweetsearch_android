/**
 *  UserFactory
 *  Copyright 26.04.2015 by Michael Peter Christen, @0rb1t3r
 *  This class is the android version from the original file,
 *  taken from the loklak_server project. It may be slightly different.
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program in the file lgpl21.txt
 *  If not, see <http://www.gnu.org/licenses/>.
 */

package org.loklak.android.data;

/**
 * Created by admin on 12.11.15.
 */
public class UserFactory {


    public final static String field_screen_name = "screen_name"; // used as id of the record
    public final static String field_user_id = "user_id"; // to reference the id of the providing service (here: twitter)
    public final static String field_name = "name";
    public final static String field_profile_image_url_http = "profile_image_url_http";
    public final static String field_profile_image_url_https = "profile_image_url_https";
    public final static String field_profile_image = "profile_image";
    public final static String field_appearance_first = "appearance_first";
    public final static String field_appearance_latest = "appearance_latest";


}
