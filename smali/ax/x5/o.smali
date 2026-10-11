.class public final synthetic Lax/x5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/x5/M$b;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lax/p5/p;


# direct methods
.method public synthetic constructor <init>(JLax/p5/p;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lax/x5/o;->a:J

    iput-object p3, p0, Lax/x5/o;->b:Lax/p5/p;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 1
    iget-wide v0, p0, Lax/x5/o;->a:J

    iget-object v2, p0, Lax/x5/o;->b:Lax/p5/p;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lax/x5/M;->u(JLax/p5/p;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
