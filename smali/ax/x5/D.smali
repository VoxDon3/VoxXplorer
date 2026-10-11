.class public final synthetic Lax/x5/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/x5/M$b;


# instance fields
.field public final synthetic a:J


# direct methods
.method public synthetic constructor <init>(J)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lax/x5/D;->a:J

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    .line 1
    iget-wide v0, p0, Lax/x5/D;->a:J

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, p1}, Lax/x5/M;->e(JLandroid/database/Cursor;)Lax/s5/f;

    move-result-object p1

    return-object p1
.end method
