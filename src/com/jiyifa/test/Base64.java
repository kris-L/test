package com.jiyifa.test;

import java.io.UnsupportedEncodingException;

public class Base64 {
    private static byte[] base64DecodeChars;
    private static char[] base64EncodeChars;

    static {
        Base64.base64EncodeChars = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 
                'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 
                't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
                '+', '/'};
        
        Base64.base64DecodeChars = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
                -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 
                60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
                15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 
                30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 
                51, -1, -1, -1, -1, -1};
    }

    public Base64() {
        super();
    }

    public static byte[] decode(String str) throws UnsupportedEncodingException {
        int v3;
        int v2;
        int v1;
        int v0;
        int v6;
        int v13 = 61;
        int v12 = -1;
        int v8 = str.length() % 4;
        if(v8 == 2) {
            str = str + "==";
        }
        else if(v8 == 3) {
            str = str + "=";
        }

        StringBuffer v9 = new StringBuffer();
        byte[] v4 = str.getBytes("US-ASCII");
        int v7 = v4.length;
        int v5 = 0;
        while(true) {
            if(v5 < v7) {
                while(true) {
                    v6 = v5 + 1;
                    v0 = Base64.base64DecodeChars[v4[v5]];
                    if(v6 < v7 && v0 == v12) {
                        v5 = v6;
                        continue;
                    }

                    break;
                }

                if(v0 == v12) {
                    v9.toString().getBytes("iso8859-1");
                }

                do {
                    v5 = v6;
                    v6 = v5 + 1;
                    v1 = Base64.base64DecodeChars[v4[v5]];
                    if(v6 >= v7) {
                        break;
                    }
                }
                while(v1 == v12);

                if(v1 == v12) {
                    v9.toString().getBytes("iso8859-1");
                }

                v9.append(((char)(v0 << 2 | (v1 & 48) >>> 4)));
                do {
                    v5 = v6;
                    v6 = v5 + 1;
                    v2 = v4[v5];
                    if(v2 == v13) {
                        byte[] v10 = v9.toString().getBytes("iso8859-1");
                        return v10;
                    }

                    v2 = Base64.base64DecodeChars[v2];
                    if(v6 >= v7) {
                        break;
                    }
                }
                while(v2 == v12);

                if(v2 == v12) {
                    v9.toString().getBytes("iso8859-1");
                }

                v9.append(((char)((v1 & 15) << 4 | (v2 & 60) >>> 2)));
                do {
                    v5 = v6;
                    v6 = v5 + 1;
                    v3 = v4[v5];
                    if(v3 == v13) {
                        return v9.toString().getBytes("iso8859-1");
                    }

                    v3 = Base64.base64DecodeChars[v3];
                    if(v6 >= v7) {
                        break;
                    }
                }
                while(v3 == v12);

                if(v3 == v12) {
                    v9.toString().getBytes("iso8859-1");
                }

                v9.append(((char)((v2 & 3) << 6 | v3)));
                v5 = v6;
                continue;
            }
            else {
                v9.toString().getBytes("iso8859-1");
            }
        }
    }

    public static String encode(byte[] data) {
        StringBuffer v6 = new StringBuffer();
        int v5 = data.length;
        int v4 = 0;
        while(v4 < v5) {
            int v3 = v4 + 1;
            int v0 = data[v4] & 255;
            if(v3 == v5) {
                v6.append(Base64.base64EncodeChars[v0 >>> 2]);
                v6.append(Base64.base64EncodeChars[(v0 & 3) << 4]);
                v6.append("==");
            }
            else {
                v4 = v3 + 1;
                int v1 = data[v3] & 255;
                if(v4 == v5) {
                    v6.append(Base64.base64EncodeChars[v0 >>> 2]);
                    v6.append(Base64.base64EncodeChars[(v0 & 3) << 4 | (v1 & 240) >>> 4]);
                    v6.append(Base64.base64EncodeChars[(v1 & 15) << 2]);
                    v6.append("=");
                }
                else {
                    int v2 = data[v4] & 255;
                    v6.append(Base64.base64EncodeChars[v0 >>> 2]);
                    v6.append(Base64.base64EncodeChars[(v0 & 3) << 4 | (v1 & 240) >>> 4]);
                    v6.append(Base64.base64EncodeChars[(v1 & 15) << 2 | (v2 & 192) >>> 6]);
                    v6.append(Base64.base64EncodeChars[v2 & 63]);
                    ++v4;
                    continue;
                }
            }

            break;
        }

        return v6.toString();
    }
}


